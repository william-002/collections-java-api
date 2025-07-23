package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer n : numeros) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNum = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer n : numeros) {
                if (n >= maiorNum) {
                    maiorNum = n;
                }
            }
            return maiorNum;
        }else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public int encontrarMenorNumero(){
        int menorNum = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer n : numeros){
                if(n <= menorNum){
                    menorNum = n;
                }
            }
            return menorNum;
        }else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else {
            System.out.println("Lista vazia");
        }
    }
}
