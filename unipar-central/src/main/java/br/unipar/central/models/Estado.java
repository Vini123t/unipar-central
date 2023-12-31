package br.unipar.central.models;

public class Estado extends AbstractBaseEntity {

    private String nome;
    private String sigla;
    private Pais pais;

    public Estado() {
    }

    public Estado(long id, String nome, String sigla, Pais pais) {
        this.nome = nome;
        this.sigla = sigla;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estado{"
                + ", nome='" + nome + "\n"
                + ", sigla='" + sigla + "\n"
                + ", pais=" + pais
                + '}';
    }
}
