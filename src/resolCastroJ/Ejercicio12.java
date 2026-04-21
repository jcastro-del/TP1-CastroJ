package resolCastroJ;
import java.util.Arrays;
import java.util.Scanner;

//arreglo unidimensional
public class Ejercicio12 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        //creamos el array vacio para q se almacenen los datos 
        int[] numeros = new int[5];

        //cargamos ese array
        for (int i = 0; i < 5; i++){
            System.out.println("Ingresa 5 numeros: ");
            numeros[i] = teclado.nextInt(); //guardamos esos datos ingresados
        }

        //ordenamos de menor a mayor 
        Arrays.sort(numeros);

        //ordenamos de mayor a menor 
        System.out.println("Ordenados de mayor a menor: ");
        for (int i = 4; i >= 0; i--){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
