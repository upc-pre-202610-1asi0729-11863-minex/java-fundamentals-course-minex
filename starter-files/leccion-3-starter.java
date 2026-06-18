import java.util.Scanner;

public class Main {

    // PASO 1: Método sin retorno (void) ───────────────────────
    // Crea:  public static void mostrarTitulo()
    // Que imprima:
    //   "=== Mini Market ==="
    //   "Caja registradora"


    // PASO 2: Método con retorno — calcular subtotal ──────────
    // Crea:  public static double calcularSubtotal(double precio, int cantidad)
    // Que devuelva  precio * cantidad


    // PASO 3: Método con retorno — aplicar descuento ──────────
    // Crea:  public static double aplicarDescuento(double total)
    // Si total >= 50 → return total * 0.9
    // Si no          → return total


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // PASO 4: Usa los métodos con Scanner ─────────────────
        // Llama a mostrarTitulo()
        //
        // Imprime "¿Cuál es el precio del producto?"
        // Lee con  double precio = teclado.nextDouble();
        //
        // Imprime "¿Cuántas unidades vas a comprar?"
        // Lee con  int cantidad = teclado.nextInt();
        //
        // Calcula  double subtotal = calcularSubtotal(precio, cantidad);
        // Imprime "Subtotal: S/ " + subtotal
        //
        // Calcula  double totalFinal = aplicarDescuento(subtotal);
        // Imprime "Total a pagar: S/ " + totalFinal


        // ── PRÁCTICA ─────────────────────────────────────────
        // TODO 1: Crea  public static void mostrarResumen(String mensaje, double valor)
        //         que imprima  mensaje + ": S/ " + valor
        //         Úsalo para mostrar el subtotal y el total final.
        //
        // TODO 2: Prueba con precio = 20.0 y cantidad = 3
        //         (subtotal = 60, debería aparecer el descuento).
        //
        // TODO 3: Cambia aplicarDescuento para que el descuento
        //         sea del 20% en lugar del 10%.
    }
}