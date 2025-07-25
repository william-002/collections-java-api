package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> qtdPalavras;

    public ContagemPalavras() {
        this.qtdPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        qtdPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!qtdPalavras.isEmpty()){
            qtdPalavras.remove(palavra);
        }else  {
            System.out.println("Vazio");
        }
    }

    public int exibirContagemPalavras(){
        int total = 0;
        for(int contagem : qtdPalavras.values()){
            total += contagem;
        }
        return total;
    }

    public String encontrarPalavrasMaisFrequente(){
        String palavraUsada = null;
        int contagem = 0;
        for(Map.Entry<String, Integer> entry : qtdPalavras.entrySet() ){
            if(entry.getValue() > contagem){
                contagem = entry.getValue();
                palavraUsada = entry.getKey();
            }
        }
        return palavraUsada;
    }
}
