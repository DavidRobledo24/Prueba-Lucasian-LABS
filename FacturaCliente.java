import java.util.Scanner;

public class FacturaCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        double valorDescuento = 0;
        if (valorCompra >= 200000) {
            valorDescuento = 0.15 * valorCompra;
        } else if (valorCompra >= 50000) {
            valorDescuento = 0.02 * valorCompra;
        } else if (valorCompra >= 20000) {
            valorDescuento = 0.015 * valorCompra;
        }

        double totalPagar = valorCompra - valorDescuento;

        scanner.nextLine();
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = scanner.nextLine();

        System.out.println("\n--- Factura ---");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Monto de la compra: $" + valorCompra);
        System.out.println("Descuento aplicado: $" + valorDescuento);
        System.out.println("Total a pagar: $" + totalPagar);
        System.out.println("¡Gracias por su compra, " + nombreCliente + "!");
    }
}