import java.util.Scanner;
//Escriba un algoritmo que permita ingresar un Número N positivo y muestre por pantalla la
//suma de sus dígitos
public class ejer6tp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el numero");
        int num = sc.nextInt();
        int suma = 0;
        while (num>0){
            suma+= num % 10;
            num/= 10;

        }
        System.out.println("La suma de los digitos es: "+suma );
    }
}
