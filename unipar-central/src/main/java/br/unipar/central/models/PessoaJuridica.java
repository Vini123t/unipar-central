package br.unipar.central.models;

import java.util.ArrayList;
import java.util.Date;

public class PessoaJuridica extends Pessoa {
    private Pessoa pessoa;
    private String razaoSocial;
    private String cnpj;
    private String cnaePrincipal;
    private String fantasia;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Pessoa pessoa, String razaoSocial, String cnpj, String cnaePrincipal, String fantasia, int id, String email, ArrayList<Endereco> listaEndereco, ArrayList<Telefone> listaTelefone) {
        super(id, email, listaEndereco, listaTelefone);
        this.pessoa = pessoa;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cnaePrincipal = cnaePrincipal;
        this.fantasia = fantasia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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

    public String getCnaePrincipal() {
        return cnaePrincipal;
    }

    public void setCnaePrincipal(String cnaePrincipal) {
        this.cnaePrincipal = cnaePrincipal;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "pessoa=" + pessoa + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", cnaePrincipal=" + cnaePrincipal + ", fantasia=" + fantasia + '}';
    }
    
    
    
    
    
    
}