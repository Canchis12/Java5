package ClasificacionMascotas;

import java.util.Scanner;

public class MascotaFacturacion {
    public void veterinaria() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de animal (perro, gato, ave, otro): ");
        String tipo = sc.next().toLowerCase();

        System.out.print("Edad del animal: ");
        int edad = sc.nextInt();

        String veterinario = "";

        switch (tipo) {
            case "perro":
                veterinario = "veterinario canino";
                break;
            case "gato":
                veterinario = "veterinario felino";
                break;
            case "ave":
                veterinario = "veterinario de animales exóticos";
                break;
            default:
                veterinario = "veterinario general";
                break;
        }
        String recomendacion = "";
        if ((tipo.equals("perro") || tipo.equals("gato")) && edad > 5) {
            recomendacion = "Se recomienda vacunación adicional.";
        }

        System.out.println("Veterinario asignado: " + veterinario);
        if (!recomendacion.isEmpty()) {
            System.out.println(recomendacion);
        }
    }
}
