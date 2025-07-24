package main.set.Pesquisa;

public class Main {

    public static void main(String[] args) {

//        AgendaContatos contatos = new AgendaContatos();
//
//        contatos.exibirContatos();
//
//        contatos.adicionarContato("Natalio", 123456);
//        contatos.adicionarContato("Natalio", 121210);
//        contatos.adicionarContato("Natalio Segundo", 1111111);
//        contatos.adicionarContato("Natalio Camilo", 4435344);
//        contatos.adicionarContato("Camila", 2222222);
//
//        contatos.exibirContatos();
//
//        System.out.println(contatos.pesquisarPorNome("Natalio"));
//
//        contatos.atualizarNumeroContato("Natalio", 3333333);
//
//        contatos.exibirContatos();

        ListaTarefas lista = new ListaTarefas();

        lista.exibirTarefas();

        lista.adicionarTarefa("Filmes");
        lista.adicionarTarefa("Series");
        lista.adicionarTarefa("Desenhar");
        lista.adicionarTarefa("Ler");

        lista.exibirTarefas();

        lista.removerTarefa("Ler");
        lista.removerTarefa("Show");

        lista.exibirTarefas();

        System.out.println("Total tarefas:" + lista.contarTarefas());

        System.out.println("Pendetes:" + lista.obterTarefasPendentes());

        lista.marcarTarefaConcluida("Filmes");
        lista.marcarTarefaConcluida("Series");

        System.out.println("Concluídas:" + lista.obterTarefasConcluidas());

        lista.marcarTarefaPendente("Series");

        lista.exibirTarefas();

        lista.limparListaTarefas();
        lista.exibirTarefas();

    }

}