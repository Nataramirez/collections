package co.edu.uniquindio.tallerCollections.Ejercicio2;

import co.edu.uniquindio.tallerCollections.Ejercicio2.modelo.ObjetosStack;

public class Main {
    public static void main(String[] args) {
        ObjetosStack stack = new ObjetosStack();

        stack.push("Hola");
        stack.push("Mundo");
        stack.push(10);
        stack.pop();
        stack.pop();
        stack.push(42);
        stack.push(100);
        stack.push("Nat");
    }
}

