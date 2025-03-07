package co.edu.uniquindio.tallerCollections.ejercicio_6.modelos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Producto {
    private String codigo;
    private String nombre;
    private Double precio;

}
