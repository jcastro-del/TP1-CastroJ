package resolCastroJ;
import java.util.Scanner; 

//contar vocales en una palabra
public class Ejercicio4 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese una palabra: ");
        String palabra = teclado.nextLine().toLowerCase();

        //creamos un contador de palabras
        int contador = 0; 

        for (int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            //verficamos si es vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
                contador = contador + 1; 
            }
        }

        System.out.println("La palabra tiene " + contador + " vocales.");
    }
}
