import java.util.*;

public class ejercicio12 {
    public static void main(String[] args) {
        // Definir tamaño de la matriz y crearla aleatoriamente
        int n = 5;
        int m = 7;
        char[][] matriz = new char[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (random.nextInt(2) == 0) ? 'X' : 'O';
            }
        }
        
        // Imprimir matriz aleatoria
        System.out.println("Matriz aleatoria:");
        imprimirMatriz(matriz);
        
        // Calcular cantidad máxima de X contiguos por fila y por columna
        int[] maximoXPorFila = new int[n];
        int[] maximoXPorColumna = new int[m];
        for (int i = 0; i < n; i++) {
            int contadorX = 0;
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == 'X') {
                    contadorX++;
                    maximoXPorColumna[j] = Math.max(maximoXPorColumna[j], contadorX);
                } else {
                    contadorX = 0;
                }
            }
            maximoXPorFila[i] = contadorX;
        }
        
        // Buscar la fila con la mayor cantidad de X contiguos
        int filaMaxima = 0;
        for (int i = 1; i < n; i++) {
            if (maximoXPorFila[i] > maximoXPorFila[filaMaxima]) {
                filaMaxima = i;
            }
        }
        
        // Buscar la columna con la mayor cantidad de X contiguos
        int columnaMaxima = 0;
        for (int j = 1; j < m; j++) {
            if (maximoXPorColumna[j] > maximoXPorColumna[columnaMaxima]) {
                columnaMaxima = j;
            }
        }
        
        // Imprimir resultados
        System.out.println("Máximo de X contiguos por fila:");
        System.out.println(Arrays.toString(maximoXPorFila));
        System.out.println("Máximo de X contiguos por columna:");
        System.out.println(Arrays.toString(maximoXPorColumna));
        System.out.println("La fila con mayor cantidad de X contiguos es la número " + (filaMaxima + 1));
        System.out.println("La columna con mayor cantidad de X contiguos es la número " + (columnaMaxima + 1));
    }
    
    // Función auxiliar para imprimir una matriz de caracteres
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}