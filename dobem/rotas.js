///Kleber Meira 27/03/2021

const usuarios = require('./src/usuarios/')

module.exports = app => {
    usuarios.rotas(app)
}