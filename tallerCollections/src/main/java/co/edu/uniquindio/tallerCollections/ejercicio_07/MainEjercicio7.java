package co.edu.uniquindio.tallerCollections.ejercicio_07;

import co.edu.uniquindio.tallerCollections.ejercicio_07.modelos.Banco;

public class MainEjercicio7 {
    public static void main(String[] args) {
        Banco turnosBanco = new Banco();
        turnosBanco.agregarTurno("natalia");
        turnosBanco.agregarTurno("sara");
        turnosBanco.agregarTurno("valentina");
        turnosBanco.agregarturnoPrioritario("robinson");

        String turnoSiguiente = turnosBanco.turnoParaAtender();
        System.out.println(turnoSiguiente);
        turnoSiguiente = turnosBanco.turnoParaAtender();
        System.out.println(turnoSiguiente);
    }
}
