import java.util.ArrayList;
import java.util.Scanner;

public class arreglo2 {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Agregar 5 nombres a la lista
        System.out.println("Ingrese 5 nombres:");
        for (int i = 0; i < 5; i++) {
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }

        // Mostrar la lista inicial
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Eliminar un nombre de la lista
        System.out.println("Ingrese el nombre que desea eliminar:");
        String nombreEliminar = scanner.nextLine();
        if (nombres.contains(nombreEliminar)) {
            nombres.remove(nombreEliminar);
            System.out.println("El nombre ha sido eliminado de la lista.");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }

        // Mostrar la lista después de eliminar un nombre
        System.out.println("Lista de nombres actualizada:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}