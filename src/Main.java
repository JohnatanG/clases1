import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creamos una instancia de la clase Scanner para leer la entrada del usuario

        System.out.println("Ingrese el número de kilómetros a recorrer: "); // Solicitamos al usuario que ingrese el número de kilómetros
        double km = input.nextDouble(); // Leemos el número de kilómetros ingresado por el usuario

        double precio = km * 10.50; // Calculamos el precio del boleto multiplicando el número de kilómetros por el precio por kilómetro

        System.out.println("El precio del boleto es de: $ " + precio); // Mostramos el precio del boleto al usuario
        input.close();

    }
}