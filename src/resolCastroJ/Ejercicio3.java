package resolCastroJ;
import java.util.Scanner;

//tabla de multiplicar
public class Ejercicio3 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero = teclado.nextInt();
        
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " X " + i + " = " + (numero*i));
        }
    }
}
