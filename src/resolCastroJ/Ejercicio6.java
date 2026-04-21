package resolCastroJ;
import java.util.Scanner;

//generar un numero aleatorio y hacer q el usuario lo adivine(con pistas mas alto o mas bajo)
public class Ejercicio6 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        //creamos el numero secreto aleatorio
        int numeroSecreto = (int)(Math.random() * 10) + 1;
        int intento = 0; 

        System.out.println("adivina el numero entre el 1 y el 10");

        //creamos el bucle 
        while (intento != numeroSecreto) {
            System.out.println("Ingresa tu intento: ");
            intento = teclado.nextInt();

            if (intento < numeroSecreto){
                System.out.println("Mas alto");
            } else if (intento > numeroSecreto){
                System.out.println("Mas bajo");
            }else{
                System.out.println("Adivinaste el numero");
            }

        }
    }
}
