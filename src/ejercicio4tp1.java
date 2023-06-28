import java.util.Scanner;
public class ejercicio4tp1 {
    //este programa pide 2 valores, y si el primero es mayor que el segundo lo suma a un contador y si el primero es doblemente mayor que el segundo lo suma a otro contador.
    //al final te dice cuantos fueron mayor y cuantos doblemente mayor.
    public static void main(String[] args){
        int fin=1, cont1=0, cont2=0, aux;
        Scanner sc = new Scanner(System.in);
        while (fin==1){
            System.out.println("Escriba los pares de valores, tenga en cuenta que si pone dos 0, terminara el programa:");
            int s = sc.nextInt();
            int v = sc.nextInt();
            if(s>v){
                cont1++;
            }
            aux=v+v;
            if(s>aux){
                cont2++;
            }
            if (s==0 && v==0){
               fin++;
            }

        }
        System.out.println("La cantidad de veces que S fue mayor que v es de:" + cont1);
        System.out.println("La cantidad de veces que S fue doblemente mayor que v es de:" + cont2);
    }

}
