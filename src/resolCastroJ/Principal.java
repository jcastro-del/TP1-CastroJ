package resolCastroJ;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            //menu de elecciones
            System.out.println("Elija una opcion");
            System.out.println("(0) Salir");
            System.out.println("(1) Programa saludador");
            System.out.println("(2) Numero par");
            System.out.println("(3) Tabla de multiplicar");
            System.out.println("(4) Contar vocales en una palabra");
            System.out.println("(5) palindromo");
            System.out.println("(6) Adivina el numero");
            System.out.println("(7) Menu interactivo");
            System.out.println("(8) Conversor de temperatura");
            System.out.println("(9) Cuenta palabras");
            System.out.println("(10) Validar contraseña segura");
            System.out.println("(11) Fibonacci");
            System.out.println("(12) Arreglo unidimensional");
            System.out.println("(13) Nota de estudiantes");
            System.out.println("(14) Quitando ceros");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2.ejecutar();
                    break;
                case 3:
                    Ejercicio3.ejecutar();
                    break;
                case 4:
                    Ejercicio4.ejecutar();
                    break;
                case 5:
                    Ejercicio5.ejecutar();
                    break;
                case 6:
                    Ejercicio6.ejecutar();
                    break;
                case 7:
                    Ejercicio7.ejecutar();
                    break;
                case 8:
                    Ejercicio8.ejecutar();
                    break;
                case 9:
                    Ejercicio9.ejecutar();
                    break;
                case 10:
                    Ejercicio10.ejecutar();
                    break;
                case 11:
                    Ejercicio11.ejecutar();
                    break;
                case 12:
                    Ejercicio12.ejecutar();
                    break; 
                case 13:
                    Ejercicio13.ejecutar();
                    break;
                case 14:
                    Ejercicio14.ejecutar();
                    break;
                case 0:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}