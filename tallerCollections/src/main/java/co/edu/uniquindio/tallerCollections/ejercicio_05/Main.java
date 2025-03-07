package co.edu.uniquindio.tallerCollections.ejercicio_05;

import co.edu.uniquindio.tallerCollections.ejercicio_05.modelo.ProductosHashMap;
import co.edu.uniquindio.tallerCollections.ejercicio_05.modelo.ProductosLinkedHashMap;
import co.edu.uniquindio.tallerCollections.ejercicio_05.modelo.ProductosTreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("HashMap");
        ProductosHashMap.mostrarProductos();

        System.out.println("LinkedHashMap");
        ProductosLinkedHashMap.mostrarProductos();

        System.out.println("TreeMap");
        ProductosTreeMap.mostrarProductos();

        /*
        HashMap no mantiene un orden específico y es más rápido.
        LinkedHashMap mantiene el orden en el que se agregan lo cual lo hace
        un poco más lento que HashMap.
        TreeMap ordena los elementos naturalmente o definiendo un Comparator
        según la clave y es más lento ya que usa un árbol.

        HashMap se usa cuando se requiere mayor velocidad para agregar elementos
        donde no va a importar el orden.
        LinkedHashMap se usa cuando se quiere mantener el orden al agregar los
        elementos.
        TreeMap se utiliza cuando se requiere que las claves estén ordenadas.
         */
    }
}
