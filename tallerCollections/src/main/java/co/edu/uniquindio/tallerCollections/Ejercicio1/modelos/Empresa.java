package co.edu.uniquindio.tallerCollections.Ejercicio1.modelos;

import java.util.TreeSet;

public class Empresa {
    TreeSet<Producto> productos = new TreeSet<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void buscarProducto(Integer codigo, TreeSet<Producto> productos) {
    }
}
