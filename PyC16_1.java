public class PyC16_1<E> {
    private E[] array;
    private int size;

    // Constructor que permite especificar la capacidad inicial
    public PyC16_1(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("La capacidad inicial no puede ser negativa");
        }
        array = (E[]) new Object[capacity];
        size = 0;
    }

    // Resto de métodos de la clase
}


