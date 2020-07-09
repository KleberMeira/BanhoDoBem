'use strict'

const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const router = express.Router();

// Carrega as Rotas
const indexRoute = require('./routes/index-route');
const pessoaRoute = require('./routes/pessoa-route');

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false}));


app.use('/', indexRoute);
app.use('/pessoa', pessoaRoute);


module.exports = app;