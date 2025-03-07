package co.edu.uniquindio.tallerCollections.Ejercicio_01.modelos;

import java.util.Iterator;
import java.util.TreeSet;

public class Empresa {
    TreeSet<Producto> productos = new TreeSet<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(Integer codigo) {
        Producto producto = null;
        Iterator<Producto> listaProductos = productos.iterator();
        while (listaProductos.hasNext() && producto == null) {
            Producto productoActual = listaProductos.next();
            Integer codigoActual = productoActual.getCodigo();
            if(codigoActual == codigo){
                producto = productoActual;
            }
        }
        return producto;
    }

}
