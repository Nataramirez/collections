package co.edu.uniquindio.tallerCollections.Ejercicio11;

import co.edu.uniquindio.tallerCollections.Ejercicio11.modelo.*;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Sara");

        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen");
        Cancion cancion2 = new Cancion("Don't Speak", "No Doubt");
        Cancion cancion3 = new Cancion("Wind of Change", "Scorpions");
        Cancion cancion4 = new Cancion("Bohemian Rhapsody", "Queen");

        usuario.agregarCancionFavorita(cancion1);
        usuario.agregarCancionFavorita(cancion2);
        usuario.agregarCancionFavorita(cancion3);
        usuario.agregarCancionFavorita(cancion4);

        usuario.mostrarCancionesFavoritas();
    }
}