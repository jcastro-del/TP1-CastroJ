package resolCastroJ;
import java.util.Scanner; 

//numero par
public class Ejercicio2 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero es par.");
        }else{
            System.out.println("El numero es impar.");
        }

    }
}
