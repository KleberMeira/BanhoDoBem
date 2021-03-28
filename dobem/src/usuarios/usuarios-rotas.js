///Kleber Meira 27/03/2021

const usuarioControlador = require('./usuarios-controlador')

module.exports = app => {

    app
        .route('/usuario')
        .post(usuarioControlador.adiciona)

    app
        .route('/usuario/:id')    
}