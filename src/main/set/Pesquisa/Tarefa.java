package main.set.Pesquisa;

public class Tarefa {

    private String descricao;
    private boolean finalizado;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.finalizado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "\nTarefa{" +
                "descricao:'" + descricao + '\'' +
                ", finalizado:" + finalizado +
                '}';
    }
}
