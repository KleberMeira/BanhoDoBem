/**
 * Arquivo: config/database.js
 * Descrição: arquivo responsável pelas 'connectionStrings da aplicação: PostgreSQL.
 * Data: 08/06/2021
 * Autor: Kleber Meira
 */

 const { Pool } = require('pg');
 const dotenv = require('dotenv');
 
 
 dotenv.config();
 
 //Conexão com a Base de Dados:
 const pool = new Pool({
   max: 100, //Numero máximo de clients na pool
   host: process.env.DB_IP,
   user: process.env.DB_USER,
   database: 'bd-dobem',
   password: process.env.DB_PASSWORD,
   port: 5432,
 });
 
 pool.on('connect', () => {
   //logger.debug('Client conectado a pool!');
 });
 
 pool.on('remove', () => {
   //logger.debug('Client desconectado da pool!');
 });
 
 module.exports = {
   query: (text, params) => pool.query(text, params),
   connect: async () => await pool.connect(),
 };