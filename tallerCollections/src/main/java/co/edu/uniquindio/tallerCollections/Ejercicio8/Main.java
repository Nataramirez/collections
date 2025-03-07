package co.edu.uniquindio.tallerCollections.Ejercicio8;

import co.edu.uniquindio.tallerCollections.Ejercicio8.modelo.EditorTexto;

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
