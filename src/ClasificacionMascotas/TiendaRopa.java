package ClasificacionMascotas;

import java.util.Scanner;

public class TiendaRopa {
    public void ropa() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de prenda (camisa, pantalon, chaqueta): ");
        String prenda = sc.next().toLowerCase();

        System.out.print("Cantidad a comprar: ");
        int cantidad = sc.nextInt();

        int precio = 0;

        switch (prenda) {
            case "camisa":
                precio = 30000;
                break;
            case "pantalon":
                precio = 50000;
                break;
            case "chaqueta":
                precio = 80000;
                break;
            default:
                System.out.println("Prenda no válida.");
                return;
        }

        double total = precio * cantidad;

        if (cantidad > 5) {
            total *= 0.85; // -15%
        }

        System.out.println("Total final a pagar: $" + total);
    }
}
