import java.util.Scanner;
public class Dniyverificarsiestaenlabasededatos {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese el valor");
            int a = sc.nextInt();
            int arreglo [] = {123123,1231254,423452,123213,10020,00001};
            for (int i : arreglo){
                if (i==a){
                    System.out.println("Si esta en la base de datos "+a);
                }
            }


    }
}

