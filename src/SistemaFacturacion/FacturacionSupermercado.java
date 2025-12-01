package SistemaFacturacion;

import java.util.Scanner;

public class FacturacionSupermercado {
 public  void facturacion (){
     Scanner sc = new Scanner(System.in);

     System.out.print("Ingrese el valor total de la compra: ");
     double totalCompra = sc.nextDouble();

     System.out.print("¿Cuántos productos compró?: ");
     int productos = sc.nextInt();

     System.out.print("¿Tiene membresía? (si/no): ");
     String membresia = sc.next().toLowerCase();

     double descuento = 0;

     // Membresía
     if (membresia.equals("si")) {
         descuento += 0.10;
     }

     // Más de 10 productos
     if (productos > 10) {
         descuento += 0.05;
     }

     double totalFinal = totalCompra - (totalCompra * descuento);

     System.out.println("Total final a pagar: $" + totalFinal);
 }
}

