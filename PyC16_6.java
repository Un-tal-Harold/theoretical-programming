import java.util.ArrayList;

public class PyC16_6<T> {

    //ArrayList para almacenar elementos T en la cola
    private ArrayList<T> elementos;

    public PyC16_6() {
        elementos = new ArrayList<>();
    }

    //Metodo para agregar el elemento
    public void enqueue(T elemento) {
        elementos.add(elemento);
    }

    //Metodo para eliminar el elemento
    public T dequeue() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.remove(0);
    }

    //Metodo para verificar si la cola esta vacia
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    //Metodo que devuelve la cantidad de elementos de la cola
    public int size() {
        return elementos.size();
    }

    //Metodo que devuelve el primer elemento de la cola sin eliminarlo 
    public T peek() {
        if (elementos.isEmpty()) {
            return null;
        }
        return elementos.get(0);
    }
}
