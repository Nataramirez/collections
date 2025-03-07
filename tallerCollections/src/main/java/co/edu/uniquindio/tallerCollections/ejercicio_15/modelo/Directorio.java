package co.edu.uniquindio.tallerCollections.ejercicio_15.modelo;

import java.util.HashMap;

public class Directorio {

    private HashMap<String, String> numerosTelefonicos;

    public Directorio() {
        this.numerosTelefonicos = new HashMap<>();
    }

    public void agregarTelefono(String nombre, String numeroTelefonico) {
        if (!numerosTelefonicos.containsKey(nombre)) {
            numerosTelefonicos.put(nombre, numeroTelefonico);
        }
    }

    public String obtenerTelefono(String nombre){
        String numermoTelefonico = numerosTelefonicos.get(nombre);
        return numermoTelefonico;

    }



}
