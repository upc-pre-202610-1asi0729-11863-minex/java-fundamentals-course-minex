public class Main {
    public static void main(String[] args) {

        System.out.println("Hola mundo");

        // Variables del carrito — los cuatro tipos básicos de Java
        int     cantidadProductos = 3;
        double  precioTotal       = 0.0;
        String  nombreTienda      = "Mini Market";
        boolean tieneDescuento    = false;

        System.out.println(nombreTienda);
        System.out.println("Productos en el carrito: " + cantidadProductos);
        System.out.println("Total:                   " + precioTotal);
        System.out.println("¿Tiene descuento?        " + tieneDescuento);
    }
}