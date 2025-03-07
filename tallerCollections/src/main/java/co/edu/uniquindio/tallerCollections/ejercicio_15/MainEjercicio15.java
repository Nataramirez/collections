package co.edu.uniquindio.tallerCollections.ejercicio_15;

import co.edu.uniquindio.tallerCollections.ejercicio_15.modelo.Directorio;

public class MainEjercicio15 {

    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        directorio.agregarTelefono("Valen", "3000000000" );
        directorio.agregarTelefono("Nata", "3000000001");
        directorio.agregarTelefono("Sara", "3000000002");

        String telefono = directorio.obtenerTelefono("Valen");
        System.out.println("El numero telefonico de Valen es: " + telefono);
    }
}
