import java.util.Arrays;
import java.util.Comparator;

public class ejercicio14 {
    private int[][] resultados;
    private Corredor[] corredores;
    
    public ejercicio14() {
        resultados = new int[5][120];
        corredores = new Corredor[120];
        for (int i = 0; i < 120; i++) {
            corredores[i] = new Corredor(i+1, 0);
        }
    }
    
    private class Corredor {
        private int dorsal;
        private int tiempoTotal;
        
        public Corredor(int dorsal, int tiempoTotal) {
            this.dorsal = dorsal;
            this.tiempoTotal = tiempoTotal;
        }
    }
    
    public void introducirResultados() {
        // código para introducir los tiempos de cada corredor en cada etapa
    }
    
    public void calcularTiemposTotales() {
        for (int i = 0; i < 120; i++) {
            int tiempoTotal = 0;
            for (int j = 0; j < 5; j++) {
                tiempoTotal += resultados[j][i];
            }
            corredores[i].tiempoTotal = tiempoTotal;
        }
    }
    
    public void mostrarClasificacion() {
        Arrays.sort(corredores, new Comparator<Corredor>() {
            public int compare(Corredor c1, Corredor c2) {
                return c1.tiempoTotal - c2.tiempoTotal;
            }
        });
        System.out.println("Clasificación:");
        for (int i = 0; i < 120; i++) {
            System.out.println((i+1) + ". Dorsal " + corredores[i].dorsal + ", tiempo total: " + corredores[i].tiempoTotal);
        }
    }
}

