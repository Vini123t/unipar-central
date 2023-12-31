package br.unipar.central.models;

public class Cidade extends AbstractBaseEntity  {

    private String nome;
    private Estado estado;

    public Cidade() {
    }

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{"
                + ", nome='" + nome +  "\n"
                + ", estado=" + estado + "\n"
                + '}';
    }
    public void message(){
        System.out.println("-------------------------------------------------------------------");
    }
}
