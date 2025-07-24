package main.set.OperacoesBasicas;

public class Convidado {

    private String nome;
    private int convite;

    public Convidado(String nome, int convite) {
        this.nome = nome;
        this.convite = convite;
    }

    public String getNome() {
        return nome;
    }

    public int getConvite() {
        return convite;
    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Convidado convidado)) return false;

        return getConvite() == convidado.getConvite();
    }

    @Override
    public int hashCode() {
        return getConvite();
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", convite=" + convite +
                '}';
    }
}
