package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoquesMap;

    public EstoqueProdutos() {
        this.estoquesMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoquesMap.put(cod, new Produto(nome,preco,quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoquesMap);
    }

    public double calcularValorTotalEstoque(){
        double totalEstoque = 0;
        if(!estoquesMap.isEmpty()){
          for(Produto p: estoquesMap.values()){
             totalEstoque += p.getQuantidade() * p.getPreco();
          }
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto maisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoquesMap.isEmpty()) {
            for (Produto p : estoquesMap.values()) {
                   if(p.getPreco() > maiorPreco){
                       maiorPreco = p.getPreco();
                       maisCaro = p;
                   }
            }
        }
        return maisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto maisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoquesMap.isEmpty()) {
            for (Produto p : estoquesMap.values()) {
                if(p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    maisBarato = p;
                }
            }
        }
        return maisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto valorEstoque = null;
        double maiorValorEstoque = 0d;
        if (!estoquesMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoquesMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorEstoque) {
                    maiorValorEstoque = valorProdutoEmEstoque;
                    valorEstoque = entry.getValue();
                }
            }
        }
        return valorEstoque;
    }

}
