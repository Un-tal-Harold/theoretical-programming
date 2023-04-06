import java.util.Scanner;

public class ejercicio13 {

    private String[] equipos = new String[10];
    private int[][] tantos = new int[10][10];
    private Puntuacion[] puntuaciones = new Puntuacion[10];

    public void introducirEquipos() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el nombre del equipo " + (i+1) + ": ");
            equipos[i] = scanner.nextLine();
            puntuaciones[i] = new Puntuacion(equipos[i]);
        }
    }

    public void rellenarTabla() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Introduce los tantos del equipo " + equipos[i] + " frente al equipo " + equipos[j] + ": ");
                tantos[i][j] = scanner.nextInt();
                if (tantos[i][j] > tantos[j][i]) {
                    puntuaciones[i].ganar();
                } else if (tantos[i][j] < tantos[j][i]) {
                    puntuaciones[i].perder();
                } else {
                    puntuaciones[i].empatar();
                }
            }
        }
    }

    public void mostrarPuntuaciones() {
        for (int i = 0; i < 10; i++) {
            System.out.println(puntuaciones[i].toString());
        }
    }

    private class Puntuacion {
        private String equipo;
        private int puntos;

        public Puntuacion(String equipo) {
            this.equipo = equipo;
            this.puntos = 0;
        }

        public void ganar() {
            this.puntos += 3;
        }

        public void empatar() {
            this.puntos += 1;
        }

        public void perder() {
            
        }

        public String toString() {
            return "Equipo: " + equipo + " - Puntos: " + puntos;
        }
    }
}

