/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private Date dataNascimento;
    private String estadoCivil;
    private String rua;
    private String bairro;
    private String complemento;
    private int numero;
    private String estado;
    private String cidade;
    private String telefone;
    private String celular;

    public Cliente() {
    }

    public Cliente(int id, String nome, int idade, String sexo, String cpf, Date dataNascimento, String estadoCivil, String rua, String bairro, String complemento, int numero, String estado, String cidade, String telefone, String celular) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", estadoCivil=" + estadoCivil + ", rua=" + rua + ", bairro=" + bairro + ", complemento=" + complemento + ", numero=" + numero + ", estado=" + estado + ", cidade=" + cidade + ", telefone=" + telefone + ", celular=" + celular + '}';
    }
}
