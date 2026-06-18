public class Main {
    public static void main(String[] args) {

        // PASO 1: Operadores — subtotal de un producto ────────
        // Las variables ya están. Imprime el subtotal:
        //   System.out.println("Subtotal: " + (precio * cantidad));
        // Luego agrega dos líneas más: "Con envío" (+2.0) y "Con cupón" (-1.0)
        double precio   = 5.50;
        int    cantidad = 3;


        // PASO 2: División y módulo — repartir una cuenta ──────
        // Limpia hasta aquí y declara:
        //   int totalCuenta = 17;
        //   int amigos      = 3;
        // Imprime "Cada uno paga: " + (totalCuenta / amigos)
        // Imprime "Sobra: "        + (totalCuenta % amigos)


        // PASO 3: If-else — ¿hay descuento? ─────────────────────
        // Declara  double totalCompra = 45.0;
        // Escribe el if - else if - else:
        //   totalCompra >= 50 → "¡Felicidades! Tienes 10% de descuento."
        //   totalCompra >= 30 → "Te faltan S/ " + (50 - totalCompra) + " para el descuento."
        //   si no             → "Sigue comprando para acceder a descuentos."


        // PASO 4: Bucle for — revisar productos ─────────────────
        // Escribe un for de i=1 hasta i<=3 que imprima:
        //   "Revisando producto " + i + " de 3..."


        // PASO 5: Bucle while — productos pendientes ─────────────
        // Declara  int productosPendientes = 3;
        // Escribe un while que siga mientras productosPendientes > 0
        // Dentro: imprime el valor y luego usa productosPendientes--


        // ── PRÁCTICA ─────────────────────────────────────────
        // TODO 1: Cambia "precio" y "cantidad" y observa el subtotal.
        //
        // TODO 2: Cambia "totalCompra" a 52.0 y luego a 15.0.
        //         Verifica que aparece el mensaje correcto en cada caso.
        //
        // TODO 3: Modifica el for para que revise 5 productos en lugar de 3.
    }
}