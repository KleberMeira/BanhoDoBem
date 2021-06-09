///Kleber Meira 27/03/2021

//import usuarioDao from '../usuarios/usuarios-dao'
//const usuario = require ('./usuarios-modelo')
const { InvalidArgumentError } = require ('../erros')
const { adiciona } = require('./usuarios-dao')

module.exports = {

    async adiciona (req, res){
        const { nome, email, senha, funcao } = req.body

        try{
            const usuario = new Usuario({
                nome,
                email,
                emailVerificado: false,
                funcao
            })

            await usuario.adicionaSenha(senha)
            await usuario.adiciona()

            res.status(201).json()
        }catch (erro){
            if (erro instanceof InvalidArgumentError){
                return res.status(400).json({erro: erro.message})
            }
            res.status(500).json({ erro: erro.message})
        }
    },

    async login (req, res){
        
    },

    async logout (req, res){
        
    },



    async verificaEmail (req, res){
        try {
            const usuario = req.user
            await usuario.verificaEmail()
            res.status(200).json()
        }catch (erro){
            res.status(500).json({ erro: erro.message})
        }
    },

    async deleta (req, res){
        try{
            const usuario = await Usuario.buscaPorId(req.params.id)
            await usuario.deleta()
            res.status(200).json()
        }catch (erro){
            res.status(500).json({ erro: erro})
        }
    }
}


//Listar todos usuários
exports.listaTodos = async (req, res) => {
        try{
            const usuarios = await usuarioDao.listaTodos()
            res.json(usuarios)
        }catch (erro){
            res.status(500).json({erro: erro.message})
        }
}