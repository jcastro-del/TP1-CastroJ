package resolCastroJ;
import java.util.Scanner;

//ver si uan palabra es palindromo (si se lee igual derecho o al reves) 
public class Ejercicio5 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = teclado.nextLine().toLowerCase();

        //almacemos la palabra creada
        String palabraInvertida = ""; 

        //recorremos la palabra desde el final hasta el inicio
        for(int i = palabra.length() -1; i >= 0; i--){
            palabraInvertida = palabraInvertida + palabra.charAt(i);
        }

        //usamos equals para comparar las palabras (devuelve true o false)
        if (palabra.equals(palabraInvertida)){
            System.out.println("Esta es una palabra palindroma");
        } else{
            System.out.println("Esta no es una palabra palindroma");
        }
    }
}
