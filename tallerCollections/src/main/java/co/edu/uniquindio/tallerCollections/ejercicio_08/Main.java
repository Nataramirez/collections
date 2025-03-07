package co.edu.uniquindio.tallerCollections.ejercicio_08;

import co.edu.uniquindio.tallerCollections.ejercicio_08.modelo.EditorTexto;

public class Main {
    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();

        editor.agregarTexto("Valen!");
        editor.agregarTexto("Nat!");
        editor.agregarTexto("Sara!");
        editor.deshacer();
        editor.deshacer();
        editor.deshacer();
    }
}
