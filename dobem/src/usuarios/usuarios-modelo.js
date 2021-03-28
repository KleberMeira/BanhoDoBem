///Kleber Meira 27/03/2021

const usuarioDao               = require ('./usuarios-dao')
const { InvalidArgumentError } = require('../erros')
const validacoes               = require ('../validacoes-comuns')
const bcrypt                   = require('bcrypt')

class Usuario {

    constructor (usuario) {
        this.id               = usuario.id
        this.nome             = usuario.nome
        this.email            = usuario.email
        this.senhaHash        = usuario.senhaHash
        this.emailVerificado  = usuario.emailVerificado
        this.funcao           = usuario.funcao 
        this.valida()
    }


    async adiciona (){
        if(await Usuario.buscaPorEmail(this.email)){
            throw new InvalidArgumentError('O usuário já existe!')
        }

        await usuarioDao.adiciona(this)
        const { id } = await usuarioDao.buscaPorEmail(this.email)
        this.id = id
    }

    async adicionaSenha(senha){
        validacoes.campoStringNaoNulo(senha, 'senha')
        validacoes.campoTamanhoMinimo(senha,'senha', 8)
        validacoes.campoTamanhoMaximo(senha,'senha', 64)

        this.senhaHash = await Usuario.gerarSenhaHash(senha)
    }

    static gerarSenhaHash (senha){
        const custoHash = 12
        return bcrypt.hash(senha, custoHash)
    }

    valida (){
        validacoes.campoStringNaoNulo(this.nome, 'nome')
        validacoes.campoStringNaoNulo(this.email, 'email')
        
        const funcoesValidas = ['admin','membro']

        if(funcoesValidas.indexOf(this.funcao) === -1){
            throw new InvalidArgumentError('O campo função está inválido')
        }
    }

    async verificaEmail (){
        this.emailVerificado = true
        await usuarioDao.modificaEmailVerificado(this, this.emailVerificado)
    }

    async deleta (){
        return usuarioDao.deleta(this)
    }

    async buscaPorId(){
        const usuario = await usuarioDao.buscaPorId(id)
        if(!usuario){
            return null
        }

        return new Usuario(usuario)
    }

    static async buscaPorEmail (email){
        const usuario = await usuarioDao.buscaPorEmail(email)
        if(!usuario){
            return null
        }

        return new Usuario(usuario)
    }

}

module.exports = Usuario