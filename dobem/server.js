///Kleber Meira 27/03/2021

require('dotenv').config()

const app = require('./index')
const port = 3000

//require('./database')

//const routes = require ('./rotas')
//routes(app)

app.listen(port, () => console.log('Api funcionando!'))
