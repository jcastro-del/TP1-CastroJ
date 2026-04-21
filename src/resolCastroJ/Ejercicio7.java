package resolCastroJ;
import java.util.Scanner;
//menu interactivo
public class Ejercicio7 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        int opcion; 

        //creamos le menu 
        do{
            System.out.println("Elija una opcion");
            System.out.println("(1) - Suma");
            System.out.println("(2) - Restar");
            System.out.println("(3) - Multiplicar");
            System.out.println("(4) - Dividir");
            System.out.println("(0) - Salir");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    int num1 = teclado.nextInt();
                    System.out.println("Ingrese el segndo numero: ");
                    int num2 = teclado.nextInt();
                    System.out.println("La suma de los dos numero es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Ingrese un numero: ");
                    int num3 = teclado.nextInt();
                    System.out.println("Ingrese el segndo numero: ");
                    int num4 = teclado.nextInt();
                    System.out.println("La resta de los dos numero es: " + (num3 - num4));
                    break;
                case 3:
                    System.out.println("Ingrese un numero: ");
                    int num5 = teclado.nextInt();
                    System.out.println("Ingrese el segndo numero: ");
                    int num6 = teclado.nextInt();
                    System.out.println("La multiplicacion de los dos numero es: " + (num5 * num6));
                    break;
                case 4:
                    System.out.println("Ingrese un numero: ");
                    int num7 = teclado.nextInt();
                    System.out.println("Ingrese el segndo numero: ");
                    int num8 = teclado.nextInt();
                    System.out.println("La division de los dos numero es: " + (num7 / num8));
                    break;
                case 0:
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while (opcion != 0);
    }
}
