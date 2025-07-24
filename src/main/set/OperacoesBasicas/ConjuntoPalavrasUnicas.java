package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    public Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
           if(palavrasUnicas.contains(palavra)){
               palavrasUnicas.remove(palavra);
           }else{
               System.out.println("Palavra não encontrada");
           }
        }else{
            System.out.println("Set vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

     public void exibirPalavrasUnicas(){
        if (!palavrasUnicas.isEmpty()){
            System.out.println(palavrasUnicas);
        }else {
            System.out.println("Set vazio");
        }
     }


}
