package resolCastroJ;
import java.util.Scanner;

//fibonacci
public class Ejercicio11 {
    public static void ejecutar() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresá un numero: ");
        int n = teclado.nextInt();

        System.out.println("Serie de Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}