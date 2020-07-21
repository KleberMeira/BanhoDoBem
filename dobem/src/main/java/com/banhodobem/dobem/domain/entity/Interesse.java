package com.banhodobem.dobem.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "interesse")
public class Interesse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idPessoaInteresse")
    private Pessoa idPessoaInteresse;

    @ManyToOne
    @JoinColumn(name = "idInteresse")
    private Endereco idEndereco;

    @Column(name = "palestra", length = 40)
    private String palestra;

    @Column(name = "artesanato", length = 40)
    private String artesanato;

    @Column(name = "outro", length = 40)
    private String outro;

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

    public Endereco getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Endereco idEndereco) {
        this.idEndereco = idEndereco;
    }
}
