///Kleber Meira 27/03/2021

const usuarioControlador = require('./usuarios-controlador')
const router = require('express-promise-router')();

router.post('/usuario/listar', usuarioControlador.listarTodos)

module.exports = router;