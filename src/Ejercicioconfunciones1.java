import java.util.Scanner;
import java.util.Arrays;

public class Ejercicioconfunciones1 {
    public static final int n =10;
    public static void main(String[] args) {
        int [] arreglo = new int [n];
        int [] [] matrix = new int [2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores para el arreglo");
        cargararreglo(arreglo);
        System.out.println("Estos son los valores que introdujo");
        verarreglo(arreglo);
        System.out.println("Arreglo ordenado de forma creciente");
        ordenararreglo(arreglo);
        verarreglo(arreglo);
        int i, pares, cont=0;
        for(i=0;i<matrix.length;i++){
            Arrays.fill(matrix[i], 0);
        }
        for(i=0;i<n;i++){
            pares=compararpares(arreglo[i]);
            if(pares==1) {
                matrix[cont / 2][cont % 2] = arreglo[i];
                cont++;
            }
            if(cont == matrix.length * matrix[0].length){
                break;
            }
        }
        if(cont==0){
            System.out.print("No hay pares en la matrix");
        }
        if(cont>0){
            vermatrix(matrix);
        }
    }
    public static void cargararreglo(int []a){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<n){
            System.out.println("ingrese el "+ (i+1)+" valor");
            a[i]=sc.nextInt();
            i++;
        }
    }
    public static void verarreglo(int []a){
        for (int i : a){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void ordenararreglo(int []a){
        int i, j, aux;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
            }
        }
    }
    public static int compararpares(int a){
        if(a%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void vermatrix(int[][]a){
        int i, j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}