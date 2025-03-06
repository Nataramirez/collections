package co.edu.uniquindio.tallerCollections.Ejercicio7.modelos;

import java.util.LinkedList;

public class Banco {
    private LinkedList<String> listaTurnos = new LinkedList<>();

    public void agregarTurno(String nombreCliente) {
        listaTurnos.add(nombreCliente);
    }

    public void agregarturnoPrioritario(String nombreCliente) {
        listaTurnos.addFirst(nombreCliente);
    }

    public String turnoParaAtender(){

        return listaTurnos.pollFirst();
    }
}
