package br.unipar.central.models;

import java.util.ArrayList;

public class Banco extends AbstractBaseEntity {
    
    private int id;
    private String nome;
    private ArrayList<Agencia> listaAgencia;

    public Banco(String nome, ArrayList<Agencia> listaAgencia) {
        this.nome = nome;
        this.listaAgencia = listaAgencia;
    }

    public Banco() {

    }

    public Banco(int id, String nome, ArrayList<Agencia> listaAgencia) {
        this.id = id;
        this.nome = nome;
        this.listaAgencia = listaAgencia;
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

    public ArrayList<Agencia> getListaAgencia() {
        return listaAgencia;
    }

    public void setListaAgencia(ArrayList<Agencia> listaAgencia) {
        this.listaAgencia = listaAgencia;
    }

    @Override
    public String toString() {
        return "Banco{" + "id=" + id + ", nome=" + nome + ", listaAgencia=" + listaAgencia + '}';
    }
    

}
