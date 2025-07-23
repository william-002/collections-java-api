package main.list.Pesquisa;

public class Main {

    public static void main(String[] args) {


//        CatalogoLivros catalogoLivros = new CatalogoLivros();
//        catalogoLivros.adicionarLivro("Livro 1", "Autor 1" , 2000);
//        catalogoLivros.adicionarLivro("Livro 1", "Autor 2" , 2010);
//        catalogoLivros.adicionarLivro("Livro 2", "Autor 2" , 2020);
//        catalogoLivros.adicionarLivro("Livro 3", "Autor 4" , 2024);
//        catalogoLivros.adicionarLivro("Livro 4", "Autor 5" , 1993);
//
//        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
//
//        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2020));
//
//        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

        SomaNumeros soma = new SomaNumeros();

        soma.exibirNumeros();

        soma.adicionarNumero(4);
        soma.adicionarNumero(-5);
        soma.adicionarNumero(10);
        soma.adicionarNumero(0);

        soma.exibirNumeros();

        System.out.println("Soma total:" + soma.calcularSoma());

        System.out.println("Menor número:" + soma.encontrarMenorNumero());
        System.out.println("Maior número:" + soma.encontrarMaiorNumero());

    }

}
