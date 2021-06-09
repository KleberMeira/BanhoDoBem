///Kleber Meira 27/03/2021


const client = require('../config/database')
const { InternalServerError } = require('../erros')

//const { promisify } = require('util')
//const dbRun = promisify(db.run).bind(db)
//const dbGet = promisify(db.get).bind(db)
//const dbAll = promisify(db.all).bind(db)



exports.adiciona = async (usuario) => {

        try {
            await client.query(

                `INSERT INTO usuarios (nome, email, senhaHash, emailVerificado, funcao)
                VALUES (?, ?, ?, ?, ?)`,

                [
                    usuario.nome,
                    usuario.email,
                    usuario.senhaHash,
                    usuario.emailVerificado,
                    usuario.funcao
                ]
            )
        } catch (erro){
            throw new InternalServerError('Erro ao adicionar o usuário!')
        }
},

exports.buscaoPorId = async (id) => {
        try{
            return await client.query('SELECT * FROM usuarios WHERE id = ?', [id])
        }catch (erro){
            throw new InternalServerError('Não foi possivel encontrar o usuário!')
        }
},

exports.buscaPorEmail = async (email) => {
        try{
            return await client.query('SELECT * FROM usuarios email = ?', [email])
        }catch(erro){
            throw new InternalServerError('Não foi possivel encontrar o usuário!')
        }
},

exports.listaTodos = async() => {
        try{
            return await client.query('SELECT * FROM usuarios')
        }catch (erro){
            throw new InternalServerError('Erro ao listar usuários!')
        }
},

exports.modificaEmailVerificado = async(usuario, emailVerificado) => {
        try{
            await client.query('UPDATE usuarios SET emailVerificado = ?', [
                emailVerificado,
                usuario.id
            ])
        }catch(erro){
            throw new InternalServerError ('Erro ao modificar a verificação de e-mail')
        }
    },

exports.deleta = async(usuario) =>{
        try{
            await client.query('DELETE FROM usuarios WHERE id = ?', [usuario.id])
        }catch (erro){
            throw new InternalServerError('Erro ao deletar usuário')
        }
    }

