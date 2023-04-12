public class PyC16_3{
    public static void main(String[] args) {
        // Creamos una pila de enteros con capacidad inicial 10
        ArrayStack<Integer> pilaEnteros = new ArrayStack<>(10);
        // Creamos una pila de números de punto flotante con capacidad inicial 5
        ArrayStack<Double> pilaFlotantes = new ArrayStack<>(5);
    
        // Apilamos algunos elementos en ambas pilas
        pilaEnteros.push(1);
        pilaEnteros.push(2);
        pilaFlotantes.push(3.5);
        pilaFlotantes.push(4.2);
    
        // Mostramos el tope de ambas pilas
        System.out.println("Tope de pilaEnteros: " + pilaEnteros.peek());
        System.out.println("Tope de pilaFlotantes: " + pilaFlotantes.peek());
    
        // Desapilamos un elemento de cada pila
        int enteroDesapilado = pilaEnteros.pop();
        double flotanteDesapilado = pilaFlotantes.pop();
    
        // Mostramos los elementos desapilados
        System.out.println("Entero desapilado: " + enteroDesapilado);
        System.out.println("Flotante desapilado: " + flotanteDesapilado);
    }
    
}