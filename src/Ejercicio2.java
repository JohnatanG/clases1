import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Los kilometros que va a viajar");
        int km = sc.nextInt();
        System.out.println("Ingrese el precio por Kilometro");
        int precio = sc.nextInt();
        int costfinal=precio*km;
        System.out.println("el Precio es de $ "+ costfinal);
    }
}
