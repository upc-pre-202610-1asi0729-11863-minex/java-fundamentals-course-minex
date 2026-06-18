// ── CLASE Producto  (de la lección 4, sin cambios) ───────────
class Producto {

    private String nombre;
    private double precio;
    private int    cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre   = nombre;
        this.precio   = precio;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return precio * cantidad;
    }

    public String getNombre()   { return nombre;   }
    public double getPrecio()   { return precio;   }
    public int    getCantidad() { return cantidad; }

    public void setCantidad(int nuevaCantidad) {
        if (nuevaCantidad > 0) {
            this.cantidad = nuevaCantidad;
        }
    }
}

// ── CLASE Main  (el carrito completo) ────────────────────────
public class Main {

    // PASO 1: Método aplicarDescuento (de la lección 3) ───────
    // Crea:  public static double aplicarDescuento(double total)
    // Si total >= 50 → return total * 0.9
    // Si no          → return total


    public static void main(String[] args) {

        // PASO 2: Crea el array de productos ───────────────────
        //   Producto[] carrito = new Producto[3];
        //
        //   carrito[0] = new Producto("Cuaderno", 5.50, 2);
        //   carrito[1] = new Producto("Lapicero", 1.20, 3);
        //   carrito[2] = new Producto("Mochila",  40.00, 1);


        // PASO 3: Recorre el carrito con un for ────────────────
        //   double total = 0;
        //   for (int i = 0; i < carrito.length; i++) {
        //       double subtotal = carrito[i].calcularSubtotal();
        //       System.out.println(carrito[i].getNombre().toUpperCase()
        //                          + " x" + carrito[i].getCantidad()
        //                          + " = S/ " + subtotal);
        //       total += subtotal;
        //   }
        //   System.out.println("\nTotal: S/ " + total);


        // PASO 4: Aplica el descuento al total ─────────────────
        //   double totalFinal = aplicarDescuento(total);
        //   if (totalFinal < total) {
        //       System.out.println("¡Descuento aplicado! Total a pagar: S/ " + totalFinal);
        //   } else {
        //       System.out.println("Total a pagar: S/ " + totalFinal);
        //   }


        // ── PRÁCTICA ─────────────────────────────────────────
        // TODO 1: Cambia los tres productos del carrito por
        //         productos que tú compres normalmente.
        //
        // TODO 2: Cambia el límite del descuento de 50 a 30
        //         en aplicarDescuento, y prueba con tu carrito.
        //
        // TODO 3: Agrega un cuarto producto. Pista: cambia
        //         new Producto[3] a new Producto[4] y agrega
        //         carrito[3] = new Producto(...).
    }
}