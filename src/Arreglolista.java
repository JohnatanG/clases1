import java.util.Scanner;
import java.util.Arrays;

public class Arreglolista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Nombres = new String[5];
        String[] NombresA = new String[5];
        int cont = 0, i;

        System.out.println("Ingrese los 5 nombres no mayores a 30 caracteres");
        for (i = 0; i < 5; i++) {
            String nombre = sc.nextLine();
            while (nombre.length() > 30) {
                System.out.print("Se ha excedido el límite de caracteres. Ingrese nuevamente el nombre: ");
                nombre = sc.nextLine();
            }
            Nombres[i] = nombre;
            cont++;
        }

        System.out.println("Ingrese el nombre que desea borrar");
        String borrar = sc.nextLine();
        for (i = 0; i < cont; i++) {
            if (Nombres[i].equals(borrar)) {
                cont--;
                continue;
            }
            NombresA[i] = Nombres[i];
            System.out.println((i + 1) + " : " + Nombres[i]);
        }

        String[] NombresB = new String[cont];
        int j = 0;
        for (i = 0; i < 5; i++) {
            if (NombresA[i] != null) {
                NombresB[j] = NombresA[i];
                j++;
            }
        }

        NombresA = NombresB;

        System.out.println("Estos son los nombres que ingresó:");
        for (i = 0; i < cont; i++) {
            System.out.println((i + 1) + " : " + NombresA[i]);
        }

        Arrays.sort(NombresA);

        System.out.println("Estos son los nombres ordenados alfabéticamente:");
        for (i = 0; i < cont; i++) {
            System.out.println((i + 1) + " : " + NombresA[i]);
        }
    }
}