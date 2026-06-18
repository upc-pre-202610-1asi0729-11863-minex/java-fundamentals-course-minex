// ── CLASE Producto  (el "molde" de un producto) ──────────────
class Producto {

    // PASO 1: Atributos privados ──────────────────────────────
    // Declara tres atributos private:
    //   private String nombre;
    //   private double precio;
    //   private int    cantidad;


    // PASO 2: Constructor ─────────────────────────────────────
    // Crea:  public Producto(String nombre, double precio, int cantidad)
    // Asigna con  this.atributo = parametro


    // PASO 3: Método calcularSubtotal ─────────────────────────
    // Crea:  public double calcularSubtotal()
    //   devuelve  precio * cantidad
    //   (sin parámetros — el objeto ya conoce sus datos)


    // PASO 4: Getters ─────────────────────────────────────────
    // Crea:
    //   public String getNombre()   { return nombre;   }
    //   public double getPrecio()   { return precio;   }
    //   public int    getCantidad() { return cantidad; }


    // PASO 5: Setter con validación ───────────────────────────
    // Crea:  public void setCantidad(int nuevaCantidad)
    //   Solo cambia cantidad si nuevaCantidad > 0


    // ── PRÁCTICA ─────────────────────────────────────────────
    // TODO 3: Agrega  public void aumentarCantidad(int extra)
    //         que sume extra a cantidad.
}

// ── CLASE Main  (programa principal) ─────────────────────────
public class Main {
    public static void main(String[] args) {

        // Crea el objeto:
        //   Producto producto1 = new Producto("Cuaderno", 5.50, 2);

        // Imprime nombre, precio, cantidad y subtotal usando los getters
        //   System.out.println("Producto: " + producto1.getNombre());
        //   System.out.println("Precio:   S/ " + producto1.getPrecio());
        //   System.out.println("Cantidad: " + producto1.getCantidad());
        //   System.out.println("Subtotal: S/ " + producto1.calcularSubtotal());

        // Cambia la cantidad y muestra el nuevo subtotal:
        //   producto1.setCantidad(5);
        //   System.out.println("Nueva cantidad: " + producto1.getCantidad());
        //   System.out.println("Nuevo subtotal: S/ " + producto1.calcularSubtotal());


        // ── PRÁCTICA ─────────────────────────────────────────
        // TODO 1: Crea un segundo objeto
        //         producto2 = new Producto("Lapicero", 1.20, 3)
        //         e imprime su nombre, precio, cantidad y subtotal.
        //
        // TODO 2: Llama a producto1.setCantidad(-5) y comprueba
        //         con getCantidad() que el valor no cambió.
    }
}