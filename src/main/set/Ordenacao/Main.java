package main.set.Ordenacao;

public class Main {

    public static void main(String[] args) {

        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1L, "Peixe", 30, 2);
        produtos.adicionarProduto(2L, "Tomate", 4, 5);
        produtos.adicionarProduto(1L, "Figado", 22, 2);
        produtos.adicionarProduto(4L, "Cebola", 3, 2);

        System.out.println(produtos.exibirProdutosPorNome());

        System.out.println(produtos.exibirProdutosPorPreco());
    }



}
