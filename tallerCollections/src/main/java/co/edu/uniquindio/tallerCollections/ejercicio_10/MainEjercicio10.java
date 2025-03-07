package co.edu.uniquindio.tallerCollections.ejercicio_10;

import co.edu.uniquindio.tallerCollections.ejercicio_10.modelos.Empleado;
import co.edu.uniquindio.tallerCollections.ejercicio_10.modelos.Empresa;

public class MainEjercicio10 {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        boolean nuevoEmpleado1 = empresa.agregarEmpleado(new Empleado("Empleado1", "1094"));
        confirmarRegistro(nuevoEmpleado1);
        boolean nuevoEmpleado2 = empresa.agregarEmpleado(new Empleado("Empleado2", "1095"));
        confirmarRegistro(nuevoEmpleado2);
        boolean nuevoEmpleado3 = empresa.agregarEmpleado(new Empleado("Empleado3", "1096"));
        confirmarRegistro(nuevoEmpleado3);
        boolean nuevoEmpleado4 = empresa.agregarEmpleado(new Empleado("Empleado4", "1095"));
        confirmarRegistro(nuevoEmpleado4);

        boolean permitirAcceso1 = empresa.permitirAcceso("1096");
        confirmarAcceso(permitirAcceso1);

        boolean permitirAcceso2 = empresa.permitirAcceso("1095");
        confirmarAcceso(permitirAcceso2);

    }

    public static void confirmarRegistro(boolean registro){
        if (registro){
            System.out.println("El Empleado se ha agregado correctamente");
        }else {
            System.out.println("El Empleado ya se encuentra registrado");
        }
    }

    public static void confirmarAcceso(boolean accceso){
        if (accceso){
            System.out.println("Acceso permitido");
        }else {
            System.out.println("Acceso NO permitido");
        }

    }
}
