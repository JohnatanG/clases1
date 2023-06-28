import java.util.Scanner;
import java.util.Arrays;
public class Arrayconvencional {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String [] Nombres = new String[50];
    String [] NombresA = new String[50];
    int cont=0, i;
    System.out.println("Ingrese los 5 nombres no mayores a 30 caracteres");
    for(i=0;i<50;i++){
    String nombre = sc.nextLine();
    while(nombre.length()>30){
        System.out.print("Se a pasado de caracteres ingrese nuevamente el nombre");
        nombre = sc.nextLine();
    }
    Nombres[i]=nombre;
    cont++;
    }
    System.out.println("Ingrese el nombre que desea borrar");
    String borrar = sc.nextLine();
    for(i=0;i<=cont;i++) {
        if (Nombres[i].equals(borrar)) {
            cont--;
            continue;
        }
        NombresA[i]=Nombres[i];
    }
    String [] NombresB = new String[cont];
    int j=0;
    for(i=0;i<=cont;i++){
        if(NombresA[i]!=null){
            NombresB[j]=NombresA[i];
            j++;
        }
    }
    NombresA=NombresB;
        System.out.println("Estos son los nombres que ingreso");
        for(i=0;i<cont;i++){
            System.out.println((i+1)+ " : "+ NombresA[i]);
        }
        Arrays.sort(NombresA);
        System.out.println("Estos son los nombres ordenados alfabeticamente");
        for(i=0;i<cont;i++){
            System.out.println((i+1)+ " : "+ NombresA[i]);
        }
    }
}