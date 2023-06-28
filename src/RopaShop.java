public class RopaShop {
    private String[] inventario;

    public RopaShop() {
        inventario = new String[]{"Camisa", "Remera", "Pantalon", "Short", "Vestido"};
    }

    public void agregarPrenda(String prenda) {
        int largo = inventario.length;
        String[] inventario_ = new String[largo + 1];

        for (int i = 0; i < largo; i++) {
            inventario_[i] = inventario[i];
        }
        inventario_[largo] = prenda;

        System.out.println("El inventario contiene: ");
        for (String p : inventario_) {
            System.out.print(p + " - ");
        }

        inventario = inventario_;
    }

    public void buscarPrenda(String prenda) {
        int aux = 0;
        for (String p : inventario) {
            if (p.equals(prenda)) {
                aux = 1;
                break;
            }
        }

        if (aux == 0) {
            System.out.println("\nNo existe");
        } else {
            System.out.println("\nPrenda existente");
        }
    }

    public void venderPrenda(String prenda) {
        int largo = inventario.length;
        String[] inventario_ = new String[largo - 1];

        int i = 0;
        int aux = 0;

        while (i < largo) {
            if (inventario[i].equals(prenda)) {
                aux = 1;
                i++;
            }
            i++;
        }

        if (aux == 1) {
            i = 0;
            int j = 0;

            while (i < largo) {
                if (inventario[i].equals(prenda)) {
                    i++;
                } else {
                    inventario_[j] = inventario[i];
                    j++;
                    i++;
                }
            }

            System.out.println("Prenda vendida");

            System.out.println("El inventario contiene: ");
            for (String p : inventario_) {
                System.out.print(p + " - ");
            }

            inventario = inventario_;
        } else {
            System.out.println("No existe la prenda");
        }
    }

    public void mostrarInventario() {
        int largo = inventario.length;

        System.out.println();
        for (int i = 0; i < largo; i++) {
            System.out.println(i + 1 + ". " + inventario[i]);
        }
        System.out.println("En total hay " + largo + " artículos");
    }

    public static void main(String[] args) {
        RopaShop shop = new RopaShop();

        shop.agregarPrenda("Falda");
        System.out.println();

        shop.buscarPrenda("Falda");
        System.out.println();

        shop.venderPrenda("Remera");
        System.out.println();

        shop.mostrarInventario();
    }
}