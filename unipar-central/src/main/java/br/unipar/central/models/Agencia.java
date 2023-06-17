package br.unipar.central.models;
import br.unipar.central.repositories.BancoDAO;

import java.util.ArrayList;

public class Agencia extends AbstractBaseEntity {
    
    private int id;
    private String codigo;
    private String digito;
    private String razaoSocial;
    private String cnpj;
    private String ra;
    private Banco banco;
    private ArrayList<Telefone> listaTelefone;
    private Banco bancos;   
    
    public Agencia() {
    }


    public Agencia(int id, String codigo, String digito, String razaoSocial, String cnpj, String ra, BancoDAO banco, ArrayList<Telefone> listaTelefone, Banco bancos) {

    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public ArrayList<Telefone> getListaTelefone() {
        return listaTelefone;
    }

    public void setListaTelefone(ArrayList<Telefone> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }
    
    public Banco getBancos() {
        return bancos;
    }

    public void setBancos(Banco bancos) {
        this.bancos = bancos;
    }
    
    @Override
    public String toString() {
        return "Agencia{" + "id=" + id + ", codigo=" + codigo + ", digito=" + digito + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", ra=" + ra + ", banco=" + banco + ", listaTelefone=" + listaTelefone + '}';
    }

   
    

    
}
