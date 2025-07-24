package main.set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
         if(!produtoSet.isEmpty()){
             return produtosNome;
         }else {
             throw new RuntimeException("Vazio");
         }

    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPreco());
        if(!produtoSet.isEmpty()){
            produtosPreco.addAll(produtoSet);
            return produtosPreco;
        }else {
            throw new RuntimeException("Vazio");
        }

    }
}


