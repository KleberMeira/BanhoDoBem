package com.banhodobem.dobem.domain.entity;

public class Endereco {


    private Integer id;
    private Pessoa idPessoa;
    private Integer cep;
    private String rua;
    private String bairro;
    private Integer numero;
    private String codicaoMoradia;

    /*
    id integer primary key auto_increment,
    idPessoa integer references PESSOA(id),
    cep integer(20),
    rua varchar (40),
    bairro varchar(40),
    numero integer(5),
    condicaoMoradia varchar (20)
    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodicaoMoradia() {
        return codicaoMoradia;
    }

    public void setCodicaoMoradia(String codicaoMoradia) {
        this.codicaoMoradia = codicaoMoradia;
    }
}
