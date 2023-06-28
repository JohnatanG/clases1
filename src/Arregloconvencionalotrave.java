import java.util.Scanner;
import java.util.Arrays;
public class Arregloconvencionalotrave {
    public static void main(String[] args) {
        int i, cont = 0, n = 5;
        Scanner sc = new Scanner(System.in);
        String[] Nombres = new String[n];
        String[] NombresA = new String[n];
        String[] NombresC = {"johnatan", "alberto", "juan", "pedro", "pablo"};
        System.out.println("Escriba los nombrs del arreglo menores a 30 caracteres");
        for (i = 0; i < n; i++) {
            String nombre = sc.nextLine();
            while (nombre.length() > 30) {
                System.out.println("se excedio en la cantidad de caracteres, por favor ingrese el nombre nuevamente");
                nombre = sc.nextLine();
            }
            Nombres[i] = nombre;
            cont++;
        }
        System.out.println("Escriba el nombre que desea borrar");
        String borrar = sc.nextLine();
        for (i = 0; i < n; i++) {
            if (Nombres[i].equals(borrar)) {
                cont--;
                continue;
            }
            NombresA[i] = Nombres[i];
        }
        int j = 0;
        String[] NombresB = new String[cont];
        for (i = 0; i < n; i++) {
            if (NombresA[i] != null) {
                NombresB[j] = NombresA[i];
                j++;
            }
        }
        System.out.println("El arreglo final es");
        for (i = 0; i < cont; i++) {
            System.out.println((i + 1) + " : " + NombresB[i]);
        }
        int longitudNombresB = NombresB.length;
        int longitudNombresC = NombresC.length;
        int longitudnombrescombinada = longitudNombresB + longitudNombresC;
        String[] Nombrescombinada = new String[longitudnombrescombinada];

        System.arraycopy(NombresB, 0, Nombrescombinada, 0, longitudNombresB);
        System.arraycopy(NombresC, 0, Nombrescombinada, longitudNombresB, longitudNombresC);
        for (String nombre : Nombrescombinada) {
            System.out.println(nombre);
        }

    }
}


