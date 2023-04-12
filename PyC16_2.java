import java.util.*;

public class PyC16_2{
    public static void main(String[] args) {

        //Se crea una pila de 10000 elementos para mostrar el tiempo de ejecucion para cada operacion
        int n = 100000;
        Integer timeArrayPush, //Tiempo de ejecucion del array
        timeLinkedListPush, //Tiempo de ejecucion de la lista enlazada
        timeArrayPop, //Tiempo de implementacion del array
        timeLinkedListPop;//Tiempo de implementacion de la lista enlazada
        
        //Test de Arranque (Implementacion de la pila)
        ArrayDeque<Integer> arrayStack = new ArrayDeque<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayStack.push(i);
        }
        timeArrayPush = (int)(System.currentTimeMillis() - start);
        
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            arrayStack.pop();
        }
        timeArrayPop = (int)(System.currentTimeMillis() - start);
        
        //Test de la lista enlazada en base a la implementacion de la pila
        Stack<Integer> linkedStack = new Stack<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedStack.push(i);
        }
        timeLinkedListPush = (int)(System.currentTimeMillis() - start);
        
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            linkedStack.pop();
        }
        timeLinkedListPop = (int)(System.currentTimeMillis() - start);
        
        System.out.println("Tiempo de ejecucion del Array: " + timeArrayPush);
        System.out.println("Tiempo de implementacion del Array: " + timeArrayPop);
        System.out.println("Tiempo de ejecucion de la lista enlazada: " + timeLinkedListPush);
        System.out.println("Tiempo de implementacion de la lista enlazada: " + timeLinkedListPop);
    }
}
