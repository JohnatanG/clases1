import java.util.Scanner;


public class Examen1 {
    public static String [] inventario = {"camisa","sandalia", "zapato","blusa", "anteojos"};
    public static void main(String[] args) {
        inventario=agregarPrenda("anillo");
        buscarPrenda("sandalia");
        inventario=venderPrenda("zapatos");
        mostrarInventario();
    }
    public static String [] agregarPrenda(String prenda){
        int tamanio;
        tamanio=inventario.length;
        String[] inventario_ = new String[tamanio+1];
        int i=0;
        for(String p:inventario){
            inventario_[i]=p;
            i++;
        }
        inventario_[tamanio]=prenda;
        return inventario_;
    }
    public static void buscarPrenda(String prenda){
        int aux=0;
        for(String p:inventario){
            if(p.equals(prenda)){
                System.out.println("Se encontro la prenda");
                aux=1;
            }
        }
        if(aux==0){
            System.out.println("no existe la prenda");
        }
    }
    public static String [] venderPrenda(String prenda){
        int aux=0;
        int tamanio;
        int i=0, j=0;
        tamanio= inventario.length;
        String [] inventario_=new String [tamanio-1];
        for(String p: inventario) {
            if (p.equals(prenda)) {
                aux = 1;
                break;
            }
        }
        if(aux==1) {
            for (String p : inventario) {
                if (!p.equals(prenda)) {
                    inventario_[j] = inventario[i];
                    j++;
                }
                i++;
            }
            System.out.println("la fue prenda vendida");
            return inventario_;
        }
        else {
            System.out.println("la prenda no existe");
            return inventario;
        }
    }
    public static void mostrarInventario(){
        for(String p:inventario){
            System.out.print(p +" - ");
        }
    }
}