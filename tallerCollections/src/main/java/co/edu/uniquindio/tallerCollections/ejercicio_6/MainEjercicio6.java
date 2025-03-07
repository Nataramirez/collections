package co.edu.uniquindio.tallerCollections.ejercicio_6;

import co.edu.uniquindio.tallerCollections.ejercicio_6.modelos.Tienda;

public class MainEjercicio6 {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        tienda.agregarProducto("001", "Laptop", 1500.0);
        tienda.agregarProducto("002", "Mouse", 25.0);
        tienda.agregarProducto("003", "Teclado", 45.0);
        tienda.agregarProducto("004", "Diadema", 60.0);
        tienda.agregarProducto("005", "Base refrigerante", 83.0);
        tienda.agregarProducto("006", "Lampara", 35.0);


        System.out.println("Inventario ordenado por nombre:");
        tienda.listarInventarioOrdenadoPorNombre();

        System.out.println("\nInventario ordenado por precio:");
        tienda.listarInventarioOrdenadoPorPrecio();

        tienda.eliminarProducto("002");

        System.out.println("Inventario luego de eliminar el producto con codigo 002:");
        tienda.listarInventarioOrdenadoPorNombre();

        System.out.println("Producto con codigo 005:");
        System.out.println(tienda.buscarProducto("005"));
    }
}
