package co.edu.uniquindio.tallerCollections.Ejercicio_13.modelos;

import co.edu.uniquindio.tallerCollections.Ejercicio_13.enums.Prioridad;

public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private Prioridad prioridad;

    public Paciente(String nombre, Prioridad prioridad) {
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
    public int compareTo(Paciente paciente) {
        return prioridad.compareTo(paciente.getPrioridad());
    }
}
