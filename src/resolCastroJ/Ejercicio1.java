package resolCastroJ;
import java.util.Scanner;

//programa saludador
public class Ejercicio1 {
    public static void ejecutar(){

        Scanner teclado = new Scanner(System.in);

        System.out.print("ingrese su nombre: ");

        String nombre = teclado.nextLine();

        System.out.println("Hola " + nombre + "!");

    }
}