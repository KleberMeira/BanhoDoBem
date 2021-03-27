const usuarios = require('./src/usuarios')

module.exports = app => {
    usuarios.rotas(app)
}