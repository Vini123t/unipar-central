package br.unipar.central.models;

import br.unipar.central.enums.OperadoraEnum;

public class Telefone extends AbstractBaseEntity {

    private String numero;
    private OperadoraEnum operadoraEnum;

    public Telefone() {
    }

    public Telefone(String numero, OperadoraEnum operadoraEnum) {
        this.numero = numero;
        this.operadoraEnum = operadoraEnum;
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
