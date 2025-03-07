package co.edu.uniquindio.tallerCollections.ejercicio_14.modelo;

import java.util.ArrayDeque;

class HistorialMensajes{
    private ArrayDeque<String> mensajes;
    private static final int MAX_MESSAGES = 10;

    public HistorialMensajes() {
        mensajes = new ArrayDeque<>();
    }

    // Método para agregar un nuevo mensaje al historial
    public void addMessage(String mensaje) {
        if (mensajes.size() == MAX_MESSAGES) {
            mensajes.removeFirst();
        }
        mensajes.addLast(mensaje);
        System.out.println("Mensaje agregado: " + mensaje);
    }

    // Método para mostrar los últimos mensajes
    public void displayMessages() {
        System.out.println("Historial de mensajes enviados:");
        for (String msg : mensajes) {
            System.out.println(msg);
        }
    }
}