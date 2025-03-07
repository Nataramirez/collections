package co.edu.uniquindio.tallerCollections.ejercicio_05.modelo;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductosLinkedHashMap {
    public static void mostrarProductos() {
        Map<String, Double> productos = new LinkedHashMap<>();

        productos.put("Cereal", 6500.0);
        productos.put("Leche", 5000.0);
        productos.put("Yogur", 9000.0 );

        System.out.println("Productos en LinkedHashMap:");
        productos.forEach((key, value) -> System.out.println(key + " - $" + value));
    }
}