package resolCastroJ;

//quitando ceros
public class Ejercicio14 {

    public static void ejecutar() {

        int[][] matriz = {
            {1, 2, 0, 3, 0, 7},
            {0, 0, 0, 0},
            {0, 6, 9, 8, 0, 9, 6},
            {0, 0, 0, 0, 7, 9, 0, 0},
            {0, 0, 0, 0, 0},
            {8, 7, 0, 8, 9, 0, 8}
        };

        for (int[] fila : matriz) {
            boolean hayNumeros = false;

            for (int num : fila) {
                if (num != 0) {
                    System.out.print(num + " ");
                    hayNumeros = true;
                }
            }

            if (hayNumeros) {
                System.out.println();
            }
        }
    }
}