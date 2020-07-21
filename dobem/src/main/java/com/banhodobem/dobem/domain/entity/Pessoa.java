package com.banhodobem.dobem.domain.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "idCadastro")
    private Integer idCadastro;

    @Column(name = "nomeComunidade", length = 100)
    private String nomeComunidade;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "dataNascimento")
    private Date dataNascimento;

    @Column(name = "idade", length = 4)
    private Integer idade;

    @Column(name = "aposentado", length = 5)
    private String aposentado;

    @Column(name = "estadoCivil", length = 20)
    private String estadoCivil;

    @Column(name = "numFilho", length = 5)
    private Integer numFilho;

    @Column(name = "estadoNascimento", length = 20)
    private String estadoNascimento;

    @Column(name = "telefone", length = 20)
    private Integer telefone;

    @Column(name = "telRecado", length = 20)
    private Integer telRecado;

    @Column(name = "respRecado", length = 100)
    private String respRecado;

    public Pessoa(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(){
    }

    public Pessoa(String nome){
        this.nome = nome;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
    }

    public String getNomeComunidade() {
        return nomeComunidade;
    }

    public void setNomeComunidade(String nomeComunidade) {
        this.nomeComunidade = nomeComunidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getAposentado() {
        return aposentado;
    }

    public void setAposentado(String aposentado) {
        this.aposentado = aposentado;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getNumFilho() {
        return numFilho;
    }

    public void setNumFilho(Integer numFilho) {
        this.numFilho = numFilho;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getTelRecado() {
        return telRecado;
    }

    public void setTelRecado(Integer telRecado) {
        this.telRecado = telRecado;
    }

    public String getRespRecado() {
        return respRecado;
    }

    public void setRespRecado(String respRecado) {
        this.respRecado = respRecado;
    }

    /*
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
     */

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
