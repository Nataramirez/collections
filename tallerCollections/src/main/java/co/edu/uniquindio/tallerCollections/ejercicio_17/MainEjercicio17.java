package co.edu.uniquindio.tallerCollections.ejercicio_17;

import co.edu.uniquindio.tallerCollections.ejercicio_17.modelo.Evento;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class MainEjercicio17 {
    public static void main(String[] args) {

        TreeMap<LocalDate, Evento> agendaEventos = new TreeMap<>();

        agendaEventos.put(LocalDate.of(2025, 3, 3), new Evento("Concierto", "Bogota"));
        agendaEventos.put(LocalDate.of(2025, 3, 16), new Evento("Conferencia", "Armenia"));
        agendaEventos.put(LocalDate.of(2025, 4, 1), new Evento("Capacitacion", "Armenia"));
        agendaEventos.put(LocalDate.of(2025, 5, 10), new Evento("Concierto 2", "Cali"));

        mostrarEventoMasProximo(agendaEventos);
    }

    public static void mostrarEventoMasProximo(TreeMap<LocalDate, Evento> eventos) {
        Map.Entry<LocalDate, Evento> evento = eventos.firstEntry();
        System.out.println("Evento más próximo: " + evento.getValue() + ". La fecha es: " + evento.getKey());
    }
}
