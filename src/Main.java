import main.list.OperacoesBasicas.CarrinhoDeCompras;
import main.list.OperacoesBasicas.ListaTarefa;

import java.util.List;


public class Main {

    public static void main(String[] args) {
//        ListaTarefa listaTarefa = new ListaTarefa();
//
//        System.out.println("Número de tarefas:" + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.adicionarTarefa("abc");
//        listaTarefa.adicionarTarefa("abc");
//        listaTarefa.adicionarTarefa("abcd");
//
//        System.out.println("Número de tarefas:" + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.removerTarefa("abc");
//        System.out.println("Número de tarefas:" + listaTarefa.obterNumeroTotalTarefas());
//
//        listaTarefa.obterDescricoesTarefas();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Mamão", 3.88, 2);
        carrinho.adicionarItem("Banana", 2.93, 6);
        carrinho.adicionarItem("Abacaxi", 8.00 , 1);
        carrinho.adicionarItem("Açucar",4.99, 1);

        carrinho.exibirItens();

        carrinho.removerItem("Açucar");

        carrinho.exibirItens();

        System.out.println("Valor total: " + carrinho.calcularValorTotal());


    }
}