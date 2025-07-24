package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
          Convidado convidadoRemover = null;
          for(Convidado c : convidados){
              if(c.getConvite() == codigoConvite){
                  convidadoRemover = c;
                  break;
              }
          }
          convidados.remove(convidadoRemover);
    }

    public int contarConvidados(){

        return convidados.size();
    }

  public void exibirConvidados(){
      System.out.println(convidados);
  }
}
