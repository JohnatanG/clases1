import java.util.Scanner;
public class ejercicio7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
      System.out.println("Escriba un numero");
      int num = sc.nextInt();
      int suma=0, cont=1;
      suma=num;
      char eleccion='n';
      do {
          System.out.println("Desea ingresar otro numero s/n ");
          eleccion = sc.next(). charAt(0);
          if (eleccion == 's') {
              System.out.println("Escriba un numero");
              int num2 = sc.nextInt();
              suma+= num2;
              cont++;
          }
      }
          while (eleccion!='n');
          System.out.println("La cantidad de numeros ingresados fue de " + cont);
          System.out.println("Y la suma total de estos es de " +suma);
        }
    }

