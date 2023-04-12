import java.util.Scanner;
import java.util.function.Function;

public class Menu2{

    public static void main(String[] args) {
        int seguir = 0;
do{
    System.out.println("Menu: Ejercicios Vectores");
    System.out.println("1. Ejercicio - Cuadrados de 100 numeros");
    System.out.println("2. Ejercicio - Suma pares-impares");
    System.out.println("3. Ejercicio - Notas");
    System.out.println("4. Ejercicio - Vectores");
    System.out.println("5. Ejercicio - Metodo");
    System.out.println("6. Ejercicio - Comparacion de Vectores");
    System.out.println("7. Ejercicio - Operaciones con Vectores");


    Scanner p = new Scanner(System.in);
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese la opcion:");
    int opcion = p.nextInt();

    switch (opcion) {
        case 1:
        int[] numeros = new int[100];

        // Rellenar el vector con los primeros 100 números enteros
        for (int i = 0; i < 100; i++)
        {
            numeros[i] = i + 1;
        }

        // Mostrar los números en una lista
        System.out.println("Lista de los primeros 100 números enteros:");
        for (int num : numeros)
        {
            System.out.print(num + " ");
        }

        // Calcular los cuadrados de los números y mostrarlos en una lista
        int[] cuadrados = new int[100];
        for (int i = 0; i < 100; i++)
        {
            cuadrados[i] = numeros[i] * numeros[i];
        }

        System.out.println("\n\nLista de los cuadrados de los primeros 100 números enteros:");
        for (int cuadrado : cuadrados) 
        {
            System.out.print(cuadrado + " ");
        }
        break;

        case 2:

        int[] vector = new int[20];
        int sumaPares = 0;
        int sumaImpares = 0;
        
        for (int i = 0; i < vector.length; i++) 
        {
            vector[i] = (int) Math.floor(Math.random() * (100-1))+1;
            System.out.print(vector[i] + " ");
            if(vector[i] % 2 == 0) 
                sumaPares += vector[i];
            else
                sumaImpares += vector[i];
        }
        System.out.println("");
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);

        break;

        case 3:

        int n = 5; // Número de notas
        double[] notas = new double[n];

        // Leer las notas
        leerNotas(notas);

        // Escribir las notas
        System.out.println("Notas:");
        escribirNotas(notas);

        // Calcular la nota media
        double media = calcularMedia(notas);
        System.out.println("La nota media es: " + media);

        break;

        case 4:

        double Vector []= new double[10];
        double escalar = 0.2; 

        for (int i = 0; i < 10; i++)
        {
            Vector[i] = Math.random() * 10;
        }

        System.out.print("Vector original: ");
        for (double num : Vector) 
        {
            System.out.print(num + " ");
        }
        System.out.println();

       
        double[] producto = multiplicar(Vector, escalar);

       
        System.out.print("Producto: ");
        for (double num : producto) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
        eliminarMinimo(Vector);
        
        System.out.print("Vector modificado: ");
        for (double num : Vector) 
        {
            System.out.print(num + " ");
        }
        System.out.println();

        break;

        case 5:

        Function <Integer, Integer> fib = (j) -> 
       {
        int[] values = new int[j + 1];
        values[0] = 0;
        values[1] = 1;
        for (int i = 2; i <= j; i++) {
        values[i] = values[i - 1] + values[i - 2];
        }
        int i = 0;
       return values[i];
       };    

        break;

        case 6:

        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {1, 2, 3, 4, 5};
        int[] vector3 = {5, 4, 3, 2, 1};

        if (compararVectores(vector1, vector2))
        {
            System.out.println("Los vectores 1 y 2 son iguales.");
        } else 
        {
            System.out.println("Los vectores 1 y 2 son diferentes.");
        }

        if (compararVectores(vector1, vector3)) 
        {
            System.out.println("Los vectores 1 y 3 son iguales.");
        } else 
        {
            System.out.println("Los vectores 1 y 3 son diferentes.");
        }

        break;

        case 7:

        int[][] matriz1 = {{10,5}, {3,9}};
        int[][] matriz2 = {{2, 4}, {6, 54}};

        int[][] resultado = sumarMatrices(matriz1, matriz2);

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("Resultado de la suma:");
        imprimirMatriz(resultado);

        break;
    }
    System.out.println("\n");
    System.out.println("Seguir [1] - Salir [0]:");
    seguir = s.nextInt();

 }while(seguir == 1);

}
    // Subprograma para leer las notas
    public static void leerNotas(double[] notas)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las " + notas.length + " notas:");
        for (int i = 0; i < notas.length; i++) 
        {
            notas[i] = sc.nextDouble();
        }
    }

    // Subprograma para escribir las notas
    public static void escribirNotas(double[] notas) 
    {
        for (double nota : notas)
        {
            System.out.println(nota);
        }
    }

    // Subprograma para calcular la nota media
    public static double calcularMedia(double[] notas) 
    {
        double suma = 0;
        for (double nota : notas) 
        {
            suma += nota;
        }
        return suma / notas.length;
    }

    public static double[] multiplicar(double[] vector, double escalar) 
    {
        double[] producto = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            producto[i] = vector[i] * escalar;
        }
        return producto;
    }

    public static void eliminarMinimo(double[] vector) 
    {
        double minimo = Double.MAX_VALUE;
        int indice = 0;
        for (int i = 0; i < vector.length; i++) 
        {
            if (vector[i] < minimo) {
                minimo = vector[i];
                indice = i;
            }
        }
        vector[indice] = vector[vector.length - 1];

    }

    public static boolean compararVectores(int[] vector1, int[] vector2) 
    {
        if (vector1.length != vector2.length) 
        {
            return false;
        }
        for (int i = 0; i < vector1.length; i++)
        {
            if (vector1[i] != vector2[i]) 
            {
                return false;
            }
        }
        return true;
    }

    // Procedimiento que suma dos matrices de la misma dimensión
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    // Procedimiento para imprimir una matriz en consola
    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}