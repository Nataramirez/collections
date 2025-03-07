package co.edu.uniquindio.tallerCollections.Ejercicio11.modelo;

public class Cancion {
    private String titulo;
    private String artista;

    // Constructor
    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    // Sobrescribir equals y hashCode para evitar duplicados en el LinkedHashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return titulo.equals(cancion.titulo) && artista.equals(cancion.artista);
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() + artista.hashCode();
    }

    // Sobrescribir toString para mostrar la canción de manera legible
    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}
