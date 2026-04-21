package resolCastroJ;
import java.util.Scanner;

//validar contrasenia segura
public class Ejercicio10 {
    public static void ejecutar(){
        Scanner teclado = new Scanner(System.in); 

        System.out.println("Ingrese una contraseña: ");
        String contrasenia = teclado.nextLine(); 

        //acumulamos las may / min / numeros
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        //recorremos la contrasenia letra por letra 
        for (int i = 0 ; i < contrasenia.length(); i++){
            char c = contrasenia.charAt(i);

            if (Character.isUpperCase(c)) {
                mayusculas = mayusculas + 1;
            } else if (Character.isLowerCase(c)){
                minusculas = minusculas + 1;
            } else if (Character.isDigit(c)){
                numeros = numeros + 1;
            }
        }
         if (contrasenia.length() >= 8 && mayusculas >= 2 && minusculas >= 3 && numeros >= 2 ){
            System.out.println("La contraseña ingresada es segura!");
        } else{
            System.out.println("La contraseña ingresada es insegura!");
        }
    }
}
