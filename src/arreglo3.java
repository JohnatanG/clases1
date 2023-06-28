import java.util.Scanner;
import java.util.ArrayList;

public class arreglo3 {
    public static void main(String[] args){
        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba los 5 nombres de la lista");
        for(int i=0;i<5;i++){
            String nombre = sc.nextLine();
            nombres.add(nombre);
        }
        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }

}