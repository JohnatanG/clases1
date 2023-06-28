import java.util.Scanner;
public class OOPejercicio1 {
    int id;
    String nombre;
    String apellido;

    public OOPejercicio1(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarnombre() {
        System.out.println("hola, soy un alumno y se decir mi nombre");
    }
}