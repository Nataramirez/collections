package co.edu.uniquindio.tallerCollections.Ejercicio_04.modelos;

import co.edu.uniquindio.tallerCollections.Ejercicio_04.enums.Prioridad;

public class Tarea implements Comparable<Tarea> {
    private String nombre;
    private Prioridad prioridad;

    public Tarea(String nombre, Prioridad prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea tarea) {
        return prioridad.compareTo(tarea.getPrioridad());
    }
}
