public class PyC16_1_1<E> {
    private E[] array;
    private int front;
    private int rear;
    private int size;

    // Constructor que permite especificar la capacidad inicial
    public PyC16_1_1(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("La capacidad inicial debe ser al menos 1");
        }
        array = (E[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Resto de métodos de la clase
    // ...
}