package resolCastroJ;
import java.util.Scanner;

//notas de estudiantes 
public class Ejercicio13 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        //array de nombres 
        String[] nombres = new String[3];

        //array de notas 
        double [][] notas = new double[3][3];

        //pedimos datos 
        for (int e = 0; e < 3; e++){
            System.out.println("ingrese el nombre del estudiante: ");
            nombres[e] = teclado.nextLine();

            double suma = 0; 

            for(int n = 0; n < 3; n++){
                System.out.println("nota " + (n + 1) + ": ");
                notas[e][n] = teclado.nextDouble();
                suma += notas[e][n];
            }

            teclado.nextLine();

            double promedio = suma / 3;

            System.out.println("tu promedio es " + nombres[e] + ": " + promedio );
            System.out.println();
        }
    }
}
