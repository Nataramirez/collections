package co.edu.uniquindio.tallerCollections.ejercicio_9.modelo;

import javax.swing.*;
import java.util.Stack;

public class Navegador {

    private Stack<String> historial;

    public Navegador(){
        this.historial = new Stack<>();
    }

    String[] opciones = {"Visitar página", "Retroceder", "Ver historial", "Salir"};

    public void navegar() {
        boolean ejecutando = true;


        while (ejecutando) {
            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Navegador Web",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (opcion) {
                case 0:
                    visitarPagina();
                    break;
                case 1:
                    retroceder();
                    break;
                case 2:
                    mostrarHistorial();
                    break;
                case 3:
                    ejecutando = false;
                    break;
                default:
                    break;
            }
        }

    }


    public void visitarPagina() {

        String url = JOptionPane.showInputDialog("Ingrese la URL:");

        if (url != null && !url.trim().isEmpty()) {
            historial.push(url);
            JOptionPane.showMessageDialog(null, "Visitando: " + url);
        } else {
            JOptionPane.showMessageDialog(null, "URL no válida.");
        }
    }

    public void retroceder() {
        if (historial.size() > 1) {
            historial.pop();
            JOptionPane.showMessageDialog(null, "Regresando a: " + historial.peek());
        } else {
            JOptionPane.showMessageDialog(null, "No hay más páginas para retroceder.");
        }
    }

    public void mostrarHistorial() {
        JOptionPane.showMessageDialog(null, "Historial de navegación: \n" + historial);
    }
}
