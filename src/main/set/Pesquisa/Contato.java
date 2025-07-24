package main.set.Pesquisa;

public class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Contato contato)) return false;

        return getNome().equals(contato.getNome());
    }

    @Override
    public int hashCode() {
        return getNome().hashCode();
    }

    @Override
    public String toString() {
        return "\nContato{" +
                "nome:'" + nome + '\'' +
                ", numero:" + numero +
                '}';
    }
}
