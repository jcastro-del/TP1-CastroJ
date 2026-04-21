package resolCastroJ;
import java.util.Scanner;

//cuenta palabras 
public class Ejercicio9 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String texto = teclado.nextLine().trim();

        //isempty pregunta (esta vacio??) devuelte true o false
        if (texto.isEmpty()){
            System.out.println("La cantidad de palabras es: 0");
        } else {
            String [] palabras = texto.split("[\\s,.;:¡!¿?]+"); //split 
            System.out.println("Cantidad de palabras: " + palabras.length);
        }

    }
}
