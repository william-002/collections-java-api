package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

 private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa removerTarefa = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    removerTarefa = t;
                    break;
                }
            }
            tarefaSet.remove(removerTarefa);
        }else {
            System.out.println("Vazio");
        }
        if (removerTarefa == null){
            System.out.println("Não encontrado");
        }
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            System.out.println("Sem tarefas");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();

    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isFinalizado()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendetes = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isFinalizado()){
                tarefasPendetes.add(t);
            }
        }
        return tarefasPendetes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t: tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setFinalizado(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa pendente = null;
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                pendente = t;
                break;
            }
        }

        if(pendente != null){
            if(pendente.isFinalizado()){
                pendente.setFinalizado(false);
            }
        }else {
            System.out.println("Não encontrado");
        }
    }

    public void limparListaTarefas(){
        if(tarefaSet.isEmpty()){
            System.out.println("Lista vazia");

        }else tarefaSet.clear();
    }

}
