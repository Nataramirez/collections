package co.edu.uniquindio.tallerCollections.Ejercicio4;

import co.edu.uniquindio.tallerCollections.Ejercicio4.enums.Prioridad;
import co.edu.uniquindio.tallerCollections.Ejercicio4.modelos.Tarea;

import java.util.PriorityQueue;

public class MainEjercicio4 {
    public static void main(String[] args) {
        PriorityQueue<Tarea> priorityQueue = new PriorityQueue<>();

        Tarea tarea1 = new Tarea("parcial calculo", Prioridad.ALTA);
        Tarea tarea2 = new Tarea("consulta", Prioridad.BAJA);
        Tarea tarea3 = new Tarea("quiz", Prioridad.MEDIA);
        Tarea tarea4 = new Tarea("parcial estructuras", Prioridad.ALTA);
        priorityQueue.add(tarea1);
        priorityQueue.add(tarea2);
        priorityQueue.add(tarea3);
        priorityQueue.add(tarea4);

        for (Tarea tarea : priorityQueue) {
            System.out.print(tarea.getNombre() + "\n" );
        }

    }
}
