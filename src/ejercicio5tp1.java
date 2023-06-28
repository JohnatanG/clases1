import java.util.Scanner;
// Calcular la suma y el promedio de números ingresados. La cantidad de números a ingresar
//no se conoce, pero se sabe que deben pertenecer al rango [0,100]. La carga finaliza
//cuando el usuario ingresa un valor fuera del rango.
public class ejercicio5tp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  promedio, nota=0, acumsuma=0, aux=1, notaaux;

        System.out.println("Escriba las notas");

    while (nota>=0 && nota<=100){

        nota = sc.nextInt();
        notaaux=nota;
        if(nota>100){
            notaaux= 0;
        }
        acumsuma+=notaaux;
        aux++;

    }
    promedio=acumsuma/aux;
    System.out.println("La suma de todas las notas es "+ acumsuma);
    System.out.println("La el promedio de todas las notas es "+ promedio);
    }
}
