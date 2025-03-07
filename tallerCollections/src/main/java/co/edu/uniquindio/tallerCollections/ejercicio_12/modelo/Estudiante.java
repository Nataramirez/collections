package co.edu.uniquindio.tallerCollections.ejercicio_12.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Estudiante implements Comparable<Estudiante> {

    private String nombre;
    private int edad;
    private String carrera;

    @Override
    public int compareTo(Estudiante e) {
        return this.nombre.compareTo(e.nombre);
    }
}
