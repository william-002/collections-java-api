package main.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTree = new TreeMap<>(eventos);
        System.out.println(eventosTree);
    }

    public void obterProximoEvento() {

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTree = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento é " + entry.getValue() + " no dia " + entry.getKey());
                break;
            }
        }

    }
}
