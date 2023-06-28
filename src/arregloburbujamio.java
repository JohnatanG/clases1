import java.util.Scanner;
public class arregloburbujamio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux=0;
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = sc.nextInt();
        int [] arreglo = new int[tamaño];
        for (int i=0;i<tamaño; i++){
            System.out.print("ingrese un valor");
            arreglo [i] = sc.nextInt();
            for(int j=0; j<(tamaño-1); j++){
                if (arreglo[j] > arreglo [i]){
                    aux=arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1] = aux;
                    System.out.print(" "+j);
                    System.out.print(" "+(j+1));
                }
            }

        }
        for( int i=0; i<tamaño; i++ ) System.out.print(arreglo[i] + " ");
    }
}
