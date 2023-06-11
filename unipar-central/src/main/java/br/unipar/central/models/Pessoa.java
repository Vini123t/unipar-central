
package br.unipar.central.models;

import java.sql.Date;
import java.util.ArrayList;


public class Pessoa {
    
    private int id;
    private String nome;
    private String documento;
    private Date dtNascimento;
    private ArrayList<Endereco> enderecos;
    private ArrayList<Telefone> telefones;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String documento, Date dtNascimento, ArrayList<Endereco> enderecos, ArrayList<Telefone> telefones) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.dtNascimento = dtNascimento;
       
        this.enderecos = enderecos;
        this.telefones = telefones;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }


    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", documento=" + documento + ", dtNascimento=" + dtNascimento + ", tipoPessoa=" +   ", enderecos=" + enderecos + ", telefones=" + telefones + '}';
    }
    
}
