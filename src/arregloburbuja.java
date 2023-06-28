
import java.util.Scanner;
public class arregloburbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.println("Por favor, ingrese el tamaño del arreglo:");
        int n = scanner.nextInt();

        // Crear el arreglo y solicitar los valores al usuario
        int[] arreglo = new int[n];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // a) Imprimir los valores en el mismo orden en que fueron ingresados
        System.out.println("Los valores ingresados son:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();

        // b) Imprimir los valores en orden inverso al que fueron cargados
        System.out.println("Los valores en orden inverso son:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // c) Imprimir todos los números pares
        System.out.println("Los números pares son:");
        for (int valor : arreglo) {
            if (valor % 2 == 0) {
                System.out.print(valor + " ");
            }
        }
        System.out.println();

        // d) Imprimir los valores en posiciones impares del arreglo
        System.out.println("Los valores en posiciones impares son:");
        for (int i = 1; i < n; i += 2) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
