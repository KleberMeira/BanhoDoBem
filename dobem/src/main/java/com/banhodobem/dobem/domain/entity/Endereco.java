package com.banhodobem.dobem.domain.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    /*
    @ManyToOne
    @JoinColumn(name = "idPessoa" )
    private Pessoa idPessoa;
     */

    @ManyToOne
    @JoinColumn(name = "nomeMorador")
    private Pessoa nomeMorador;

    @Column(name = "cep", length = 20)
    private Integer cep;

    @Column(name = "rua", length = 40)
    private String rua;

    @Column(name = "bairro", length = 40)
    private String bairro;

    @Column(name = "numero", length = 5)
    private Integer numero;

    @Column(name = "condicaoMoradia", length = 20)
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

    @OneToMany(mappedBy = "idEndereco")
    private List<Interesse> interesses;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Pessoa getNomemorador() {
        return nomeMorador;
    }

    public void setMorador(Pessoa nomeMorador) {
        this.nomeMorador = nomeMorador;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", cep=" + cep +
                ", rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero=" + numero +
                ", codicaoMoradia='" + codicaoMoradia + '\'' +
                '}';
    }
}

