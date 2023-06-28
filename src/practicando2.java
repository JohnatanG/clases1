import java.util.Arrays;
import java.util.Scanner;
public class practicando2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arreglo = new int[15];
        int [] arreglob = new int[15];
        System.out.println("ingrese la cantidad de valores del arreglo");
        cargarvalores(arreglo);
        valorboleano(arreglo, arreglob);
        verarreglo(arreglob);
    }
    public static void cargarvalores(int []a){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<15;i++){
            a[i]= sc.nextInt();
        }
    }
    public static void valorboleano(int []a, int []b){
        for(int i=0;i<14;i++){
            if(a[i]>a[i+1]){
                b[i]=1;
            }
            else{
                b[i]=0;
            }
            }
        }

    public static void verarreglo(int []a){
        for(int i=0;i<15;i++){
            System.out.printf(" "+ a[i]);
        }
    }
    }
