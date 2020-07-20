package com.banhodobem.dobem.domain.entity;

public class Interesse {

    private Integer id;
    private Pessoa idPessoaInteresse;
    private String palestra;
    private String artesanato;
    private String outro;

    /*
    id integer primary key auto_increment,
     idPessoaInteresse integer references PESSOA(id),
     palestra varchar (40),
     artesanato varchar(40),
     outro integer(5)
     */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getIdPessoaInteresse() {
        return idPessoaInteresse;
    }

    public void setIdPessoaInteresse(Pessoa idPessoaInteresse) {
        this.idPessoaInteresse = idPessoaInteresse;
    }

    public String getPalestra() {
        return palestra;
    }

    public void setPalestra(String palestra) {
        this.palestra = palestra;
    }

    public String getArtesanato() {
        return artesanato;
    }

    public void setArtesanato(String artesanato) {
        this.artesanato = artesanato;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }
}
