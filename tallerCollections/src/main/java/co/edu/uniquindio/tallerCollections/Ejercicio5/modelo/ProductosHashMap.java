package co.edu.uniquindio.tallerCollections.Ejercicio5.modelo;

import java.util.HashMap;
import java.util.Map;

public class ProductosHashMap {
    public static void mostrarProductos() {

        Map<String, Double> productos = new HashMap<>();

        productos.put("Queso", 9500.0);
        productos.put("Carne", 17800.0);
        productos.put("Aceite de Oliva", 29200.0);

        System.out.println("Productos en HashMap:");
        productos.forEach((key, value) -> System.out.println(key + " - $" + value));
    }
}
