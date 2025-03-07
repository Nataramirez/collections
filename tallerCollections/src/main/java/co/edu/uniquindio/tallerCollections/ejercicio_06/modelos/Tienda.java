package co.edu.uniquindio.tallerCollections.ejercicio_06.modelos;

import java.util.ArrayList;


public class Tienda {

    private ArrayList<Producto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String codigo, String nombre, double precio) {
        if (buscarProducto(codigo) == null) {
            productos.add(new Producto(codigo, nombre, precio));
        }
    }

    public Producto buscarProducto(String codigo) {
        if (!productos.isEmpty()) {
            for (Producto producto : productos) {
                if (producto.getCodigo().equals(codigo)) {
                    return producto;
                }
            }
        }
        return null;
    }

    public void listarInventarioOrdenadoPorNombre() {
        productos.sort((a, b) -> a.getNombre().toLowerCase().compareTo(b.getNombre().toLowerCase()));
        productos.forEach(System.out::println);
    }

    public void listarInventarioOrdenadoPorPrecio() {
        productos.sort((a, b) -> Double.compare(a.getPrecio(), b.getPrecio()));
        productos.forEach(System.out::println);
    }

    public void eliminarProducto(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            productos.remove(producto);
        }
    }

}
