package co.edu.uniquindio.tallerCollections.Ejercicio_16;

import co.edu.uniquindio.tallerCollections.Ejercicio_16.modelos.Producto;

import java.util.LinkedHashMap;

public class MainEjercicio17 {
    public static void main(String[] args) {
        LinkedHashMap<Producto, Integer> productosComprados = new LinkedHashMap<>();

        Producto producto1 = new Producto("leche", 6000, 2);
        Producto producto2 = new Producto("pan", 3800, 7);
        Producto producto3 = new Producto("chocolate", 16000, 3);
        Producto producto4 = new Producto("queso", 14500, 1);

        productosComprados.put(producto1, producto1.getValorTotal());
        productosComprados.put(producto2, producto2.getValorTotal());
        productosComprados.put(producto3, producto3.getValorTotal());
        productosComprados.put(producto4, producto4.getValorTotal());

        Integer valorTotal = valorTotalComprado(productosComprados);
        System.out.println("El valor total de la compra es: $ " + valorTotal);
    }

    public static Integer valorTotalComprado(LinkedHashMap<Producto, Integer> productosComprados) {
        Integer valorTotal = 0;
        for (Producto producto : productosComprados.keySet()) {
            valorTotal += productosComprados.get(producto);
        }
        return valorTotal;
    }
}
