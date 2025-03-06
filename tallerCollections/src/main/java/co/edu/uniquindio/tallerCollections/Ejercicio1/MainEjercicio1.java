package co.edu.uniquindio.tallerCollections.Ejercicio1;

import co.edu.uniquindio.tallerCollections.Ejercicio1.modelos.Empresa;
import co.edu.uniquindio.tallerCollections.Ejercicio1.modelos.Producto;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Producto producto1 = new Producto("producto1", 1);
        Producto producto2 = new Producto("producto2", 2);
        Producto producto3 = new Producto("producto3", 3);
        empresa.agregarProducto(producto1);
        empresa.agregarProducto(producto2);
        empresa.agregarProducto(producto3);

        Producto productoBuscado = empresa.buscarProducto(4);
        if (productoBuscado != null) {
            System.out.println(productoBuscado.getNombre());
        }else {
            System.out.println("No existe el producto");
        }

    }
}
