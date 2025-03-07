package co.edu.uniquindio.tallerCollections.ejercicio_12;

import co.edu.uniquindio.tallerCollections.ejercicio_12.modelo.Estudiante;

import java.util.TreeSet;

public class MainEjercicio12 {
    public static void main(String[] args) {
        TreeSet<Estudiante> estudiantes = new TreeSet<>();

        estudiantes.add(new Estudiante("Carlos", 21, "Ingenieria"));
        estudiantes.add(new Estudiante("Ana", 19, "Medicina"));
        estudiantes.add(new Estudiante("Pedro", 22, "Arquitectura"));
        estudiantes.add(new Estudiante("Lucia", 20, "Derecho"));
        estudiantes.add(new Estudiante("Mariana", 23, "Psicologia"));

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        System.out.println("Primer estudiante: " + estudiantes.first());
        System.out.println("Último estudiante: " + estudiantes.last());

    }
}
