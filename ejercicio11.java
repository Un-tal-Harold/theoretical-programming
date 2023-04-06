import java.util.*;
//usa el complemento de complement
import complement.complemento;
public class ejercicio11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        complemento con = new complemento();

        //creacion del array
        int [][] cuadrado;
        int dimencion1=0;

        //entrada de la longitud de array
        System.out.println("Ingrese la dimencion del cuadrado");
        dimencion1=leer.nextInt();
        cuadrado = new int [dimencion1][dimencion1];

        //llenar array
        for( int q=0;q<cuadrado.length;q++){
            for(int r=0;r<cuadrado.length;r++){
                System.out.println("Ingrese numero:");
                cuadrado [q][r]=leer.nextInt();
            }
        }

        //complobacion por columnas
        boolean magico=con.esCuadradoMagico(cuadrado);

        if (magico==true){
            System.out.println("Si es un cubo magico");
        }else{
            System.out.println("No es un cubo magico");
        }

    }
}
