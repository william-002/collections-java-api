package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();

    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

}
