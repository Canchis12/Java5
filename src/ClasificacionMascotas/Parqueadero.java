package ClasificacionMascotas;

import java.util.Scanner;

public class Parqueadero {
    public void parqueadero() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de vehículo (auto, moto, bicicleta): ");
        String vehiculo = sc.next().toLowerCase();

        System.out.print("Hora de llegada (0-23): ");
        int hora = sc.nextInt();

        int costoBase;

        switch (vehiculo) {
            case "auto":
                costoBase = 5000;
                break;
            case "moto":
                costoBase = 3000;
                break;
            case "bicicleta":
                costoBase = 1000;
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }

        if (hora > 20) {
            costoBase *= 1.20; // +20%
        }

        System.out.println("Costo total a pagar: $" + costoBase);
    }
}
