package co.edu.uniquindio.tallerCollections.ejercicio_14;

import co.edu.uniquindio.tallerCollections.ejercicio_14.modelo.HistorialMensajes;

public class Main {
    public static void main(String[] args) {
        HistorialMensajes historial = new HistorialMensajes();

        // Agregar mensajes de prueba
        for (int i = 1; i <= 12; i++) {
            historial.addMessage("Mensaje de prueba " + i);
        }

        // Mostrar los últimos 10 mensajes
        historial.displayMessages();
    }
}
