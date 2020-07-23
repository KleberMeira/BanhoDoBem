CREATE TABLE PESSOA(

 id integer primary key auto_increment,
 idCadastro integer auto_increment,
 nomeComunidade varchar(100),
 nome varchar(100),
 dataNascimento timestamp,
 idade integer(4),
 aposentado varchar(5),
 estadoCivil varchar(20),
 numFilho integer(5),
 estadoNascimento varchar(20),
 telefone integer (20),
 telRecado integer(20),
 respRecado varchar(100)
);

CREATE TABLE ENDERECO(

 id integer primary key auto_increment,
 nomeMorador varchar (60)references PESSOA(id),
 idInteresse integer references INTERESSE(id),
 cep integer(20),
 rua varchar (40),
 bairro varchar(40),
 numero integer(5),
 condicaoMoradia varchar (20)
);

CREATE TABLE INTERESSE(

 id integer primary key auto_increment,
 idPessoaInteresse integer references PESSOA(id),
 idInteresse integer references ENDERECO(id)
 palestra varchar (40),
 artesanato varchar(40),
 outro varchar (40)
);

