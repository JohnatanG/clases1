import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Ejercicioconfunciones2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> lista2 = new ArrayList<Integer>();
        List<Integer> lista3 = new ArrayList<Integer>();
        Set<Integer> lista4 = new HashSet<Integer>();
        cargar(lista);
        cargar(lista2);
        unirlista(lista,lista2,lista3);
        unirset(lista,lista2,lista4);
        System.out.print(lista3);
        System.out.print(lista4);

    }

    public static void cargar(List<Integer> lista) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            int valor = sc.nextInt();
            lista.add(valor);
        }
    }
    public static void unirlista(List<Integer> lista, List<Integer>lista2, List<Integer>lista3){
        lista3.addAll(lista);
        lista3.addAll(lista2);
    }
    public static void unirset(List<Integer> lista, List<Integer>lista2, Set<Integer>lista3){
        lista3.addAll(lista);
        lista3.addAll(lista2);
    }

}
