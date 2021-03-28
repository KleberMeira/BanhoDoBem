const sqlite3 = require('sqlite3').verbose()
const db = new sqlite3.Database('db.sqlite')

const USUARIOS_SCHEMA = `
CREATE TABLE IF NOT EXISTS usuarios(
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(40) NOT NULL,
    email VARCHAR (255) NOT NULL UNIQUE,
    senhaHash VARCHAR(255) NOT NULL,
    emailVerificado INTEGER,
    funcao VARCHAR(15) CHECK (funcao in ('admin','membro')) NOT NULL
)
`

db.serialize(() => {
    db.run('PRAGMA foreign_keys=ON')
    db.run(USUARIOS_SCHEMA)
})

process.on('SIGINT', () => 
    db.close(() => {
        process.exit(0)
    })
)

module.exports = db