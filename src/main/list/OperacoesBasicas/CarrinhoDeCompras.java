package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
         itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removerItens = new ArrayList<>();
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    removerItens.add(i);
                }
            }

            itens.removeAll(removerItens);
        }else {
            System.out.println("Lista vazia");
        }
    }


    public double calcularValorTotal(){
          double total = 0;
          if(!itens.isEmpty()){
           for(Item item : itens){
               double valorItens = item.getPreco() * item.getQuantidade();
               total += valorItens;
           }
           return total;

          }else {
              System.out.println("Lista vazia");
              return 0;
          }

    }

    public void exibirItens(){
        if(!itens.isEmpty()){
            System.out.println(this.itens);
        }else {
            System.out.println("Lista vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itens +
                '}';
    }
}
