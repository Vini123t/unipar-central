package br.unipar.central.models;

import br.unipar.central.enums.OperadoraEnum;

public class Telefone extends AbstractBaseEntity {

    private String numero;
    private OperadoraEnum operadoraEnum;
    private Agencia agencia;
    private Pessoa pessoa;
    public Telefone() {
    }

    public Telefone(String numero, OperadoraEnum operadoraEnum, Agencia agencia, Pessoa pessoa) {
        this.numero = numero;
        this.operadoraEnum = operadoraEnum;
        this.agencia = agencia;
        this.pessoa = pessoa;
    }
    
    
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public OperadoraEnum getOperadoraEnum() {
        return operadoraEnum;
    }

    public void setOperadoraEnum(OperadoraEnum operadoraEnum) {
        this.operadoraEnum = operadoraEnum;
    }

    @Override
    public String toString() {
        return "Telefone{"
                + " id=" + getId() + "\n"
                + ", ra=" + getRa() + "\n"
                + ", numero='" + numero + "\n" 
                + ", operadoraEnum=" + operadoraEnum
                + '}';
    }
}
