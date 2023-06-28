import java.util.Scanner;
public class triangulo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los lados del triangulo");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && b==c){
            System.out.println("Su triangulo es un Equilatero");}
            else
                if (a!=b && a!=c && c!=b ){
                System.out.println("su triangulo es un Escaleno");}
                else {
                    System.out.println("su triangulo es un isosceles");
            }
        }
    }

