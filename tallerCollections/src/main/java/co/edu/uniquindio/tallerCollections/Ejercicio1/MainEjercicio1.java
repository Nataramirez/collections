package co.edu.uniquindio.tallerCollections.Ejercicio1;

import co.edu.uniquindio.tallerCollections.Ejercicio1.modelos.Empresa;
import co.edu.uniquindio.tallerCollections.Ejercicio1.modelos.Producto;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Producto producto = new Producto("producto1", 1);
        empresa.agregarProducto(producto);
    }
}
