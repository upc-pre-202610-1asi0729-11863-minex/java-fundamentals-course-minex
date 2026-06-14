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

    // Extra práctica
    public void aumentarCantidad(int extra) {
        this.cantidad += extra;
    }
}

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Cuaderno", 5.50, 2);

        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio:   S/ " + producto1.getPrecio());
        System.out.println("Cantidad: " + producto1.getCantidad());
        System.out.println("Subtotal: S/ " + producto1.calcularSubtotal());

        producto1.setCantidad(5);
        System.out.println("Nueva cantidad: " + producto1.getCantidad());
        System.out.println("Nuevo subtotal: S/ " + producto1.calcularSubtotal());

        // TODO 1 resuelto: segundo objeto
        Producto producto2 = new Producto("Lapicero", 1.20, 3);
        System.out.println("\nProducto: " + producto2.getNombre());
        System.out.println("Precio:   S/ " + producto2.getPrecio());
        System.out.println("Cantidad: " + producto2.getCantidad());
        System.out.println("Subtotal: S/ " + producto2.calcularSubtotal());

        // TODO 2 resuelto: setter con validación
        producto1.setCantidad(-5);
        System.out.println("\n¿Cambió con -5? Cantidad sigue siendo: " + producto1.getCantidad());
    }
}