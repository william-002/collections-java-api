package main.list.Ordenacao;

public class Main {

    public static void main(String[] args) {

        OrdenacaoPessoa pessoas = new OrdenacaoPessoa();

        pessoas.adicionarPessoa("Lauro", 21, 1.73);
        pessoas.adicionarPessoa("Priscilo", 41, 1.68);
        pessoas.adicionarPessoa("Ricarda", 28, 1.81);
        pessoas.adicionarPessoa("Mayaro", 15, 1.77);


        System.out.println(pessoas.ordenarPorIdade());
        System.out.println(pessoas.ordenarPorAltura());
    }

}
