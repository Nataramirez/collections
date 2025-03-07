package co.edu.uniquindio.tallerCollections.ejercicio_13;

import co.edu.uniquindio.tallerCollections.ejercicio_13.modelos.Paciente;
import co.edu.uniquindio.tallerCollections.ejercicio_13.enums.Prioridad;

import java.util.PriorityQueue;

public class MainEjercicio13 {
    public static void main(String[] args) {
        PriorityQueue<Paciente> turnos = new PriorityQueue<>();

        Paciente paciente1 = new Paciente("natalia", Prioridad.ALTA);
        Paciente paciente2 = new Paciente("sara", Prioridad.BAJA);
        Paciente paciente3 = new Paciente("valentina", Prioridad.MEDIA);
        Paciente paciente4 = new Paciente("robinson", Prioridad.ALTA);
        turnos.add(paciente1);
        turnos.add(paciente2);
        turnos.add(paciente3);
        turnos.add(paciente4);

        System.out.print("Orden de turnos: \n");
        for (Paciente turno : turnos) {
            System.out.print(turno.getNombre() + "\n" );
        }

        Paciente turnoSiguiente1 = turnos.poll();
        System.out.println("Atender Paciente: " + turnoSiguiente1.getNombre());

        Paciente turnoSiguiente2 = turnos.poll();
        System.out.println("Atender Paciente: " + turnoSiguiente2.getNombre());
    }
}
