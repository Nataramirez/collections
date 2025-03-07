package co.edu.uniquindio.tallerCollections.ejercicio_10.modelos;

import java.util.ArrayList;
import java.util.HashSet;

public class Empresa {
    ArrayList<Empleado> empleados = new ArrayList<>();
    HashSet<String> accesosValidos = new HashSet<>();

    public boolean agregarEmpleado(Empleado empleado) {
        boolean esEmpleado = accesosValidos.add(empleado.getIdentificacion());
        boolean nuevoEmpleado = false;
        if (esEmpleado) {
            empleados.add(empleado);
            nuevoEmpleado = true;
        }
        return nuevoEmpleado;
    }

    public boolean permitirAcceso(String identificacion) {
        return accesosValidos.contains(identificacion);
    }

}
