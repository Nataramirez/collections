package co.edu.uniquindio.tallerCollections.ejercicio_05.modelo;

import java.util.Map;
import java.util.TreeMap;

public class ProductosTreeMap {
    public static void mostrarProductos() {
        // TreeMap mantiene el orden natural de las claves
        Map<String, Double> productos = new TreeMap<>();

        productos.put("Café", 31000.0);
        productos.put("Chocolate", 7300.0);
        productos.put("Panela", 5100.0);

        System.out.println("Productos en TreeMap:");
        productos.forEach((key, value) -> System.out.println(key + " - $" + value));
    }
}