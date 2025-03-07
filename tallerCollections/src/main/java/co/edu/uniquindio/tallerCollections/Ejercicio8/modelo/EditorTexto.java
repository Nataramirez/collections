package co.edu.uniquindio.tallerCollections.Ejercicio8.modelo;

import java.util.Vector;

public class EditorTexto{
    private Vector<String> historial;
    private String contenido;

    public EditorTexto() {
        historial = new Vector<>();
        contenido = "";
    }

    // Método para agregar texto y guardarlo en el historial
    public void agregarTexto(String texto) {
        historial.add(contenido);
        contenido += texto;
        System.out.println("Texto agregado: " + texto);
        mostrarTexto();
    }

    // Método para deshacer el último cambio
    public void deshacer() {
        if (!historial.isEmpty()) {
            contenido = historial.lastElement();
            historial.remove(historial.size() - 1);
            System.out.println("Se deshizo el último cambio.");
        } else {
            System.out.println("No hay cambios por hacer.");
        }
        mostrarTexto();
    }

    // Método para mostrar el contenido actual
    public void mostrarTexto() {
        System.out.println("Contenido actual: " + contenido);
    }
}
