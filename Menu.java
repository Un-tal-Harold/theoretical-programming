import java.util.Scanner;
import java.util.Random;

public class Menu{

    public static void main(String[] args) {
    int seguir = 0;
do{
    System.out.println("Menu: Ejercicios Vectores");
    System.out.println("1. Ejercicio - Punto silla");
    System.out.println("2. Ejercicio - Temperaturas");
    System.out.println("3. Ejercicio - Estrellas");
    System.out.println("4. Ejercicio - Cuadro Magico");
    System.out.println("5. Ejercicio - Aleatorios");
    System.out.println("6. Ejercicio - Clasificatoria");
    System.out.println("7. Ejercicio - Vendedores");


    Scanner p = new Scanner(System.in);
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese la opcion:");
    int opcion = p.nextInt();

    int filas = 0;
    int columnas = 0;
    int mayor = 0;
    
    switch (opcion) {
        case 1:
        Scanner c = new Scanner(System.in);

        System.out.println("Diseñe un algoritmo que permita obtener los puntos de silla de un array de M x N elementos.");

            System.out.println("Ingrese el numero de filas [M]:");
            filas = c.nextInt();

            System.out.println("Ingrese el numero de filas [N]:");
            columnas = c.nextInt();

            int  elementos [] [] = new int[filas][columnas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {

                    System.out.println("Ingrese el elemento ["+(i+1)+"] ["+(j+1)+"]:");  
                    elementos [i] [j]  = c.nextInt();            
                }         
            }
            
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (elementos [i] [j] > mayor) {
                        mayor = elementos [i] [j];         
                    }                    
                }
            }
            System.out.print("Punto se silla:"+mayor);

            break;

        case 2:

        double diaria;
        double mensual = 0;
        Scanner t = new Scanner(System.in);

        System.out.println("En una tabla de N x 24 elementos se tienen almacenadas las temperaturas de cada hora de un mes de N días. Diseñe un algoritmo que genere un vector con las temperaturas medias diarias y que devuelva la temperatura media mensual.");

        System.out.println("Ingrese el numero de dias [D]:");
        filas = t.nextInt();
        
        int temperaturas [][] = new int[filas][24];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 24; j++) {

                System.out.println("Ingrese la temperatura ["+(j+1)+"]  del dia ["+(i+1)+"]:");  
                temperaturas [i][j]  = t.nextInt();          
            }         
        }
        //Sumar temperaturas diarias y mensuales
        for (int i = 0; i < filas; i++) {
            diaria = 0;
            for (int j = 0; j < 24; j++) {
                diaria += temperaturas [i][j];       
            }   
            System.out.println("Temperatura media dia ["+(i+1)+"]:"+(diaria/24));
            mensual += (diaria/24);
        }
        System.out.println("Temperatura media mensual :"+(mensual/filas));

            break;

        case 3:
        int puntos;
        int cuerpos;
        double media = 0;
        double total = 0;

        Scanner e = new Scanner(System.in);

        System.out.println("Diseñe un algoritmo que permita obtener un mapa con las estrellas de una zona del espacio. En cada elemento se almacena la intensidad  luminosa de un punto. Hay una estrella cuando la intensidad media del punto con todos los colindantes es mayor que la constante K.");

        System.out.println("Ingrese el numero de puntos [P]:");
        puntos = e.nextInt();

        System.out.println("Ingrese el numero de posibles estrellas [E]:");
        cuerpos = e.nextInt();  

        int posibilidades [][] = new int[cuerpos][puntos];

        for (int i = 0; i < cuerpos; i++) {
            for (int j = 0; j < puntos; j++) {

                System.out.println("Ingrese la intensidad luminosa del punto ["+(j+1)+"] del cuerpo celeste ["+(i+1)+"]:");  
                posibilidades [i][j]  = e.nextInt();          
            }         
        }
        //Sumar intensidades luminosas por estrella 
        for (int i = 0; i < cuerpos; i++) {
            total = 0;
            for (int j = 0; j < puntos; j++) {
                total += posibilidades [i][j];       
            }   
            System.out.println("Media cuerpo celeste["+(i+1)+"]:"+(total/puntos));
            media += (total/puntos);
        }
        System.out.println(media);

        for (int i = 0; i < cuerpos; i++) {
            for (int j = 0; j < 1; j++) {
                if (posibilidades [i][j] > media) {
                    System.out.println("Cuerpo celeste ["+cuerpos+"] Es una estrella");
                }else{
                    System.out.println("Cuerpo celeste ["+cuerpos+"] No es una estrella");
                }       
            }   
        
        }
        break;
        
        case 4:

        int num;
        int suma = 0;

        System.out.println("Diseñe una función que devuelva un valor lógico que indique si una matriz de N x N elementos es un cuadrado mágico. Una matriz es un cuadrado mágico si las suma de cada una de las columnas, de cada una de las filas y de las dos diagonales dan el mismo valor. La tabla que aparece a continuación es un cuadrado mágico");

        Scanner m = new Scanner(System.in);

        System.out.println("Ingrese la cantidad[Impares] de numeros de la matriz [E]:");
        num = m.nextInt();

        int datos [][] = new int[num][num];


        for (int j = 0; j < datos.length; j++) {
            for (int i = 0; i < datos[0].length; i++) {
                System.out.println("Ingrese el numero ["+(j+1)+"]["+(i+1)+"]:");
                datos [j][i] = m.nextInt();

                if( datos [j][i] < 1 || datos [j][i] > 9) {
                    System.out.println("Debe ingresar un numero entre 1 y 9:");
                    i--;

                }
                }
            }
            for (int h = 0; h < num; h++) {
                suma = 0;
                for (int k = 0; k < num; k++) {
                    suma += datos [h][k];              
                }
                System.out.println("Suma:"+suma);
            }
         
        break;

        case 5:

        int n;
        int contX = 0;
        int contO = 0;
        int mayorX = 0;
        int mayorO = 0;
        Random Aleatorio = new Random();

        Scanner a = new Scanner(System.in);

        System.out.println(" En un array de n x m posiciones se almacenan aleatoriamente caracteres X y O. Diseñe las estructuras de datos el programa principal y los módulos necesarios que permitan: ● Indicar por cada fila y columna la cantidad máxima de caracteres X contiguos situados en cada una de ellas. ● Indicar en que fila y en qué columna se encuentra la cantidad máxima de caracteres X contiguos.");

        System.out.println("Ingrese el valor de la matriz cuadrada [C]:");
        filas = columnas = a.nextInt();
        
        char caracteres [][] = new char[columnas][filas];

        //Generar simbolos aleatorios
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                n = Aleatorio.nextInt(2);
                if (n == 1) {
                    caracteres [i][j] = 'X';         
                }else{
                    if(n == 0){
                        caracteres [i][j] = 'O';
                    }
                }
            }
        }

        //Mostrar simbolos aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(caracteres [i][j]);   
            }
            System.out.println(" ");
        }

        //Dar el mayor numero de X - O por fila

        for (int i = 0; i < filas; i++) {
            contO = 0;
            contX = 0;
            System.out.print("\n"); 
            for (int j = 0; j < columnas; j++) {
                if (caracteres [i][j] == 'X' ) {
                    contX = contX + 1;
                }
                if (caracteres [i][j] == 'O') {
                        contO = contO + 1;         
                }                       
            }        
            System.out.print("Fila:"+(i+1)+" N.O ["+contO+"] N.X ["+contX+"]"); 

            //Validar cantidad mayor de X
            if (contX >= mayorX) {
                mayorX = contX;  
                System.out.print("+X");              
            }
            
            //Validar cantidad mayor de O
            if (contO >= mayorO) {
                mayorO = contO;  
                System.out.print("+O");              
            }
        }

        //Dar el mayor numero de X - O por columna
        System.out.print("\n"); 

        for (int i = 0; i < columnas; i++) {
            contO = 0;
            contX = 0;
            System.out.print("\n"); 
            for (int j = 0; j < filas; j++) {
                if (caracteres [i][j] == 'X' ) {
                    contX = contX + 1;
                }
                if (caracteres [i][j] == 'O') {
                        contO = contO + 1;         
                }                       
            }        
            System.out.print("Columna:"+(i+1)+" N.O ["+contO+"] N.X ["+contX+"]"); 

            //Validar cantidad mayor de X
            if (contX >= mayorX) {
                mayorX = contX;  
                System.out.print("+X");              
            }
            
            //Validar cantidad mayor de O
            if (contO >= mayorO) {
                mayorO = contO;  
                System.out.print("+O");              
            }
        }
        break;

        case 6:
        Scanner entrada = new Scanner(System.in);
        int valores  [][] = new int [5][120];
        int sumaF = 0;

        System.out.println("La V Edición de la Vuelta Ciclista a los Campos Manchegos consta de 5 etapas en las que participan 120 ciclistas. Los resultados de cada etapa se almacenan en un  array de 5 filas y 120 columnas en el que cada elemento contiene el tiempo en segundos que ha tardado el corredor en realizar la etapa. Si un corredor no ha finalizado una etapa aparecerá un 0 en el elemento correspondiente. Los corredores se almacenan en un array de 120 posiciones en el que se almacenará el dorsal del corredor y el tiempo total realizado.");
                        
                        System.out.println("Ingrese el numero de corredores:");
                        columnas =entrada.nextInt();
                                
                        System.out.println("Ingrese los valores:");
                        for(int i = 0;i < columnas;i++)
                          {
                                for(int j = 0;j < 5;j++)
                            {
                               System.out.println("Etapa ["+(j+1)+"] Corredor ["+(i+1)+"]");
                               valores [i][j]= entrada.nextInt();
                            }
                        }  
                        //Mostrar valores de tiempo
                        System.out.println("\nArray con los tiempos:");
                        for(int i = 0;i < columnas;i++)
                          {
                                for(int j = 0;j < 5;j++)
                            {
                               System.out.println("Ciclista ["+(i+1)+"] Tiempo ["+(j+1)+"] : "+valores[i][j]+"min");
                            }
                        }

                        //Ganadores por Etapa
                        System.out.println("\nGanador por etapa:");
                        for(int i = 0;i < 5;i++)
                          {
                                for(int j = 0;j < columnas;j++)
                            {
                               if(mayor < valores[i][j]){
                                    mayor = valores[i][j];
                                } 
                            }
                                System.out.println("Ganador Etapa ["+(i+1)+"] Tiempo ["+mayor+"]"); 
                        }
                        
                        //Sumar tiempos
                        System.out.println("\nArray con los ciclistas:");    
                        for(int i = 0;i < columnas;i++)
                          {
                            sumaF = 0;
                                for(int j = 0;j < 5;j++)
                            {
                                sumaF += valores[i][j];       
                            }
                                System.out.println("Ciclista ["+(i+1)+"] - Tiempo total ["+(sumaF)+"min]");             
                        }  
        break;

        case 7:

        Scanner valor = new Scanner(System.in);
        int ventas [][] = new int[5][7];
        double totalV = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("Ingrese la venta N ["+(j+1)+"] del vendedor ["+(i+1)+"]:");  
                ventas [i][j] = valor.nextInt();               
            }           
        } 

        //Mostrar ventas por vendedor
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println(ventas [i][j]);           
            } 
            System.out.println(" ");
        } 
        
        //Mostrar ventas totales por vendedor
        for (int i = 0; i < 5; i++) {
            totalV = 0;
            for (int j = 0; j < 7; j++) {
                totalV += ventas [i][j];  
            } 
            System.out.println("Vendedor ["+(i+1)+"]:"+totalV);    
        }

        break;          
    }
    System.out.println("Seguir [1] - Salir [0]:");
    seguir = s.nextInt();

    }while(seguir == 1);
  }
}