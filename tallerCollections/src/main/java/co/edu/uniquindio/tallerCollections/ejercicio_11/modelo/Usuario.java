package co.edu.uniquindio.tallerCollections.ejercicio_11.modelo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Usuario {
    private String nombre;
    private Set<Cancion> cancionesFavoritas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.cancionesFavoritas = new LinkedHashSet<>();
    }

    // Método para agregar una canción a favoritos
    public void agregarCancionFavorita(Cancion cancion) {
        cancionesFavoritas.add(cancion);
        System.out.println("Canción añadida a favoritos: " + cancion);
    }

    // Método para mostrar las canciones favoritas
    public void mostrarCancionesFavoritas() {
        System.out.println("Canciones favoritas de " + nombre + ":");
        for (Cancion cancion : cancionesFavoritas) {
            System.out.println(cancion);
        }
    }
}