import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args){
        double a, ur, pe, tr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el monto");
        a = sc.nextInt();
        ur=a*0.37;
        pe=a*0.42;
        tr=a*0.21;
        System.out.println("Area           Presupuesto");
        System.out.println("urgencias          "+ur    );
        System.out.println("Pediatria          "+pe    );
        System.out.println("Traumatologia      "+tr    );


    }

}
