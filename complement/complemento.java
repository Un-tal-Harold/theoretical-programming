package complement;
public class complemento {
    
    public static boolean esCuadradoMagico(int[][] matriz) {
        int n = matriz.length;
        int sumaObjetivo = (n * (n * n + 1)) / 2; // Suma objetivo para cada fila/columna/diagonal
        
        // Comprobar suma de filas
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaObjetivo) {
                return false;
            }
        }
        
        // Comprobar suma de columnas
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaObjetivo) {
                return false;
            }
        }
        
        // Comprobar suma de diagonal principal
        int sumaDiagonalPrincipal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }
        if (sumaDiagonalPrincipal != sumaObjetivo) {
            return false;
        }
        
        // Comprobar suma de diagonal secundaria
        int sumaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += matriz[i][n - i - 1];
        }
        if (sumaDiagonalSecundaria != sumaObjetivo) {
            return false;
        }
        
        // Si llegamos aquí, la matriz es un cuadrado mágico
        return true;
    }
}
