public class Main {
    public static void main(String[] args) {

        // Operadores: subtotal de un producto
        double precio   = 5.50;
        int    cantidad = 3;
        System.out.println("Subtotal:  " + (precio * cantidad));
        System.out.println("Con envío: " + (precio * cantidad + 2.0));
        System.out.println("Con cupón: " + (precio * cantidad - 1.0));

        // División y módulo: repartir una cuenta
        int totalCuenta = 17;
        int amigos      = 3;
        System.out.println("Cada uno paga: " + (totalCuenta / amigos));
        System.out.println("Sobra:         " + (totalCuenta % amigos));

        // If-else: ¿hay descuento?
        double totalCompra = 45.0;
        if (totalCompra >= 50) {
            System.out.println("¡Felicidades! Tienes 10% de descuento.");
        } else if (totalCompra >= 30) {
            System.out.println("Te faltan S/ " + (50 - totalCompra) + " para el descuento.");
        } else {
            System.out.println("Sigue comprando para acceder a descuentos.");
        }

        // Bucle for: revisar productos
        for (int i = 1; i <= 3; i++) {
            System.out.println("Revisando producto " + i + " de 3...");
        }

        // Bucle while: productos pendientes
        int productosPendientes = 3;
        while (productosPendientes > 0) {
            System.out.println("Quedan " + productosPendientes + " productos por escanear.");
            productosPendientes--;
        }
    }
}