package co.edu.uniquindio.tallerCollections.ejercicio_02.modelo;

import java.util.Stack;

public class ObjetosStack {
    private Stack<Object> stack;
    private Class<?> topType;

    public ObjetosStack() {
        stack = new Stack<>();
        topType = null;
    }

    // Método para insertar un elemento si coincide con el tipo de la cima
    public void push(Object obj) {
        if (stack.isEmpty()) {
            stack.push(obj);
            topType = obj.getClass();
            System.out.println("Elemento " + obj + " agregado a la pila.");
        } else if (obj.getClass().equals(topType)) {
            stack.push(obj);
            System.out.println("Elemento " + obj + " agregado a la pila.");
        } else {
            System.out.println("Error: No se puede agregar un elemento de tipo "
                    + obj.getClass().getSimpleName() + " porque la pila contiene " + topType.getSimpleName());
        }
    }

    // Método para retirar el elemento en la cima
    public Object pop() {
        if (!stack.isEmpty()) {
            Object removed = stack.pop();
            System.out.println("Elemento " + removed + " eliminado de la pila.");
            topType = stack.isEmpty() ? null : stack.peek().getClass();
            return removed;
        }
        System.out.println("Error, la pila está vacía.");
        return null;
    }

    // Método para obtener el elemento en la cima sin eliminarlo
    public Object peek() {
        return stack.isEmpty() ? null : stack.peek();
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
