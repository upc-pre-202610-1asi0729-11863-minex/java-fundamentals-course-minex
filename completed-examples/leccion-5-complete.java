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

public class Main {

    public static double aplicarDescuento(double total) {
        if (total >= 50) return total * 0.9;
        else             return total;
    }

    public static void main(String[] args) {

        // Array de objetos — el carrito (lección 5)
        Producto[] carrito = new Producto[3];
        carrito[0] = new Producto("Cuaderno", 5.50, 2);
        carrito[1] = new Producto("Lapicero", 1.20, 3);
        carrito[2] = new Producto("Mochila",  40.00, 1);

        double total = 0;
        for (int i = 0; i < carrito.length; i++) {
            double subtotal = carrito[i].calcularSubtotal();
            System.out.println(carrito[i].getNombre().toUpperCase()
                               + " x" + carrito[i].getCantidad()
                               + " = S/ " + subtotal);
            total += subtotal;
        }

        System.out.println("\nTotal: S/ " + total);

        double totalFinal = aplicarDescuento(total);
        if (totalFinal < total) {
            System.out.println("¡Descuento aplicado! Total a pagar: S/ " + totalFinal);
        } else {
            System.out.println("Total a pagar: S/ " + totalFinal);
        }
    }
}