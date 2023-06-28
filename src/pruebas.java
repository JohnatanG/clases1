import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();
        Set<Integer> lista3 = new HashSet<Integer>(); 
        cargar(lista);
        cargar(lista2);
        unirListas(lista, lista2, lista3);
        System.out.println("Lista resultante:");
        System.out.println(lista3);
    }

    public static void cargar(List<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 valores:");
        for (int i = 0; i < 10; i++) {
            int valor = sc.nextInt();
            lista.add(valor);
        }
    }

    public static void unirListas(List<Integer> lista1, List<Integer> lista2, Set<Integer> lista3) {
        lista3.addAll(lista1);
        lista3.addAll(lista2);
    }
}