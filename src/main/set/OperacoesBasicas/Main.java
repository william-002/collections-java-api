package main.set.OperacoesBasicas;

public class Main {

    public static void main(String[] args) {

//        ConjuntoConvidados convidados = new ConjuntoConvidados();
//
//        System.out.println("Quantidade convidados no Set:" + convidados.contarConvidados());
//
//         convidados.adicionarConvidado("c1", 123);
//         convidados.adicionarConvidado("c2", 321);
//         convidados.adicionarConvidado("c3", 321);
//         convidados.adicionarConvidado("c4", 54321);
//
//        System.out.println("Quantidade convidados no Set:" + convidados.contarConvidados());
//
//        convidados.removerConvidadoPorCodigoConvite(123);
//
//        System.out.println("Quantidade convidados no Set:" + convidados.contarConvidados());
//
//        convidados.exibirConvidados();


        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Palavra 1");
        palavras.adicionarPalavra("Palavra 1");
        palavras.adicionarPalavra("Palavra 3");
        palavras.adicionarPalavra("Palavra 4");
        palavras.adicionarPalavra("Palavra 5");

        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("Palavra 5");

        palavras.exibirPalavrasUnicas();

        palavras.removerPalavra("Palavra 6");

        System.out.println(palavras.verificarPalavra("Palavra 1"));
        System.out.println(palavras.verificarPalavra("Palavra 6"));
    }
}
