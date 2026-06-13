import java.util.Scanner;

public class Main {

    public static void mostrarTitulo() {
        System.out.println("=== Mini Market ===");
        System.out.println("Caja registradora");
    }

    public static double calcularSubtotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public static double aplicarDescuento(double total) {
        if (total >= 50) return total * 0.9;
        else             return total;
    }

    public static void mostrarResumen(String mensaje, double valor) {
        System.out.println(mensaje + ": S/ " + valor);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        mostrarTitulo();

        System.out.println("¿Cuál es el precio del producto?");
        double precio = teclado.nextDouble();

        System.out.println("¿Cuántas unidades vas a comprar?");
        int cantidad = teclado.nextInt();

        double subtotal = calcularSubtotal(precio, cantidad);
        mostrarResumen("Subtotal", subtotal);

        double totalFinal = aplicarDescuento(subtotal);
        mostrarResumen("Total a pagar", totalFinal);
    }
}