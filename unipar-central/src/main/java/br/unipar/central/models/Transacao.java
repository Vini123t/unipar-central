package br.unipar.central.models;

import java.util.Date;

public class Transacao extends AbstractBaseEntity {

    private Date datahora;
    private double valor;
    private int tipo;
    private Conta ContaOrigem;
    private Conta ContaDestino;

    public Transacao() {
    }

    public Transacao(Date datahora, double valor, int tipo, Conta ContaOrigem, Conta ContaDestino) {
        this.datahora = datahora;
        this.valor = valor;
        this.tipo = tipo;
        this.ContaOrigem = ContaOrigem;
        this.ContaDestino = ContaDestino;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Conta getContaOrigem() {
        return ContaOrigem;
    }

    public void setContaOrigem(Conta ContaOrigem) {
        this.ContaOrigem = ContaOrigem;
    }

    public Conta getContaDestino() {
        return ContaDestino;
    }

    public void setContaDestino(Conta ContaDestino) {
        this.ContaDestino = ContaDestino;
    }

    @Override
    public String toString() {
        return "Transacao{"
                + "datahora=" + datahora + "\n"
                + ", valor=" + valor + "\n"
                + ", tipo=" + tipo + "\n"
                + ", ContaOrigem=" + ContaOrigem + "\n"
                + ", ContaDestino=" + ContaDestino + '}';
    }
}
