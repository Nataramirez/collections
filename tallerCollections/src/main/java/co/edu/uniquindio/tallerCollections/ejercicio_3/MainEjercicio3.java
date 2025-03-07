package co.edu.uniquindio.tallerCollections.ejercicio_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainEjercicio3 {

    public static void main(String[] args) {

        Set<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Natalia");
        nombres.add("Sara");
        nombres.add("Valentina");

        Iterator<String> iterador = nombres.iterator();

        while (iterador.hasNext()) {
            System.out.println("El nombre es: " + iterador.next());
        }

    }
}
