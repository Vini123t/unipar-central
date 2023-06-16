package br.unipar.central.models;

import java.sql.Date;
import java.util.ArrayList;

public class Pessoa extends AbstractBaseEntity {

    private int id;
    private String email;
    private ArrayList<Endereco> listaEndereco;
    private ArrayList<Telefone> listaTelefone;

    public Pessoa() {
    }

    public Pessoa(int id, String email, ArrayList<Endereco> listaEndereco, ArrayList<Telefone> listaTelefone) {
        this.id = id;
        this.email = email;
        this.listaEndereco = listaEndereco;
        this.listaTelefone = listaTelefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public ArrayList<Telefone> getListaTelefone() {
        return listaTelefone;
    }

    public void setListaTelefone(ArrayList<Telefone> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", email=" + email + ", listaEndereco=" + listaEndereco + ", listaTelefone=" + listaTelefone + '}';
    }
    
    
    
   
    
}
