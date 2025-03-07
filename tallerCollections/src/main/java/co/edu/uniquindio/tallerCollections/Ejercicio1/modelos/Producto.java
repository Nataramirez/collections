package co.edu.uniquindio.tallerCollections.Ejercicio1.modelos;

import java.util.Stack;

public class Producto implements Comparable<Producto>{
    String nombre;
    Integer codigo;

    public Producto(String nombre, Integer codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Producto producto) {
        return codigo.compareTo(producto.getCodigo());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
