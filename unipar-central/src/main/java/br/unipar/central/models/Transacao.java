package br.unipar.central.models;


import br.unipar.central.enums.TipoTransacaoEnum;
import java.sql.Timestamp;




public class Transacao extends AbstractBaseEntity {
    
 private int id;
    private Timestamp datahora;
    private double valor;
    private TipoTransacaoEnum tipo;
  
    private int conta_origem;
    private int conta_destino;

    public Transacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDatahora() {
        return datahora;
    }

    public void setDatahora(Timestamp datahora) {
        this.datahora = datahora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoTransacaoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacaoEnum tipo) {
        this.tipo = tipo;
    }

    public int getConta_origem() {
        return conta_origem;
    }

    public void setConta_origem(int conta_origem) {
        this.conta_origem = conta_origem;
    }

    public int getConta_destino() {
        return conta_destino;
    }

    public void setConta_destino(int conta_destino) {
        this.conta_destino = conta_destino;
    }

    @Override
    public String toString() {
        return "Transacao{" + "id=" + id + ", datahora=" + datahora + ", valor=" + valor + ", tipo=" + tipo + ", conta_origem=" + conta_origem + ", conta_destino=" + conta_destino + '}';
    }

   
    
    

}
    

