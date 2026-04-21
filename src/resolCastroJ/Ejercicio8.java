package resolCastroJ;
import java.util.Scanner; 

//conversor de temperatura
//vmaos a hacerlo a modo de menu 
public class Ejercicio8 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        int opcion; 
        
        do{
            System.out.println("elija una conversion");
            System.out.println("(1) - Celsius a Fahrenheit");
            System.out.println("(2) - Fahrenheit a Celsius");
            System.out.println("(0) - Salir");

            opcion = teclado.nextInt(); 

            switch (opcion) {
                case 1:
                    System.out.println("ingrese los grados celsius: ");
                    double celsius = teclado.nextDouble(); //double por q son con decimales y se necesita mucha exactitud 
                    double fahrenheit = (celsius * 9 / 5 ) + 32; 
                    System.out.println("El resultado de la conversion es: " + fahrenheit );
                    break;
                case 2:
                    System.out.println("Ingrese los grados Fahrenheit: ");
                    double fa = teclado.nextDouble();
                    double cel = (fa - 32 ) * 5 / 9;
                    System.out.println("El resultado de la conversion es: " + cel);
                    break;
                case 0:
                    System.out.println("saliendo del menu...");
                    break;
                default:
                    System.out.println("valor invalido");
                    break;
            }
        } while (opcion != 0); 
    }
}
