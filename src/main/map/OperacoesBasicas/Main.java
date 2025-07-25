package main.map.OperacoesBasicas;

public class Main {

    public static void main(String[] args) {
//
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
//        contatos.removerContato("Natalio");
//
//        contatos.exibirContatos();
//
//        System.out.println(contatos.pesquisarPorNome("Natalio Segundo"));


        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Azul", "Uma cor");
        dicionario.adicionarPalavra("Vermelho", "Outra cor");
        dicionario.adicionarPalavra("Verde", "Mais uma cor");

        dicionario.exibirPalavras();

        System.out.println("Significado:" + dicionario.pesquisarPorPalavra("Azul"));
        System.out.println("Significado:" + dicionario.pesquisarPorPalavra("Branco"));

        dicionario.removerPalavra("Verde");
        dicionario.exibirPalavras();
    }
}
