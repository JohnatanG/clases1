import java.util.Arrays;
import java.util.Scanner;

public class Practicando {
    public static int verdivisible(int b) {
        if (b % 3 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int versiexiste(int[][] a, int b) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == b) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void cargarmatrix(int[][] a, int[] b) {
        int cont = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = b[cont];
                cont++;
            }
        }
    }

    public static void verarreglo(int[] a) {
        System.out.print("Arreglo ordenado en forma decreciente: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void ordenararreglo(int[] a) {
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (a[i] < a[j]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 2, 4, 10, 5, 15, 3 };
        int[][] matrix = new int[2][3];
        int existe = 0, valor;
        int divisible = 0;

        Arrays.sort(arreglo);
        verarreglo(arreglo);
        System.out.println("--------------------------------------------------------");
        cargarmatrix(matrix, arreglo);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor para verificar si existe en la matriz: ");
        valor = scanner.nextInt();

        existe = versiexiste(matrix, valor);

        if (existe == 1) {
            System.out.println("Se encuentra en la matriz");
            divisible = verdivisible(valor);

            if (divisible == 1) {
                System.out.println("El elemento es divisible entre 3");
            } else {
                System.out.println("El elemento no es divisible entre 3");
            }
        } else {
            System.out.println("No se encuentra en la matriz");
        }

        scanner.close();
    }
}