# LECCIÓN 4 — Clases, Objetos y Encapsulación

---

[EN PANTALLA: abrir JDoodle con el archivo que tiene espacio para dos clases.]

Hola, bienvenidos de vuelta.

En esta lección aprenden el concepto más importante de Java: la **clase**. Una clase permite crear su propio tipo de dato — un tipo que tiene información interna y comportamiento propio. Con eso van a poder representar **un producto del carrito** como un objeto concreto.

---

## Clase y objeto: el molde y la copia

Piensen en una etiqueta de precio de una tienda. La etiqueta tiene un formato fijo: nombre del producto, precio, y un espacio para la cantidad que el cliente quiere. Ese formato es el mismo para todos los productos de la tienda — pero cada etiqueta llena, con sus propios datos, es distinta.

En Java: una **clase** es el formato de la etiqueta. Un **objeto** es la etiqueta ya llena con los datos de un producto específico.

Vamos a crear la clase `Producto` — el formato que define qué información tiene cada producto del carrito.

---

## Los atributos: datos internos de la clase

[EN PANTALLA: escribir la clase Producto ANTES de public class Main:]

```java
class Producto {
 
    private String nombre;
    private double precio;
    private int    cantidad;
```

Los **atributos** son las variables del objeto — los mismos tipos de dato que ya conocen, pero ahora viven dentro de la clase.

`private` los protege: nadie de afuera puede modificarlos directamente. Solo la propia clase tiene acceso. Eso se llama **encapsulación**.

---

## El constructor: cómo se crea un producto

[EN PANTALLA: agregar el constructor dentro de la clase:]

```java
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre   = nombre;
        this.precio   = precio;
        this.cantidad = cantidad;
    }
```

El **constructor** se ejecuta automáticamente al crear un nuevo objeto con `new`. Recibe los datos del producto y los guarda en los atributos.

`this.nombre` se refiere al **atributo** de la clase. `nombre` sin `this` es el **parámetro** que llegó. Como tienen el mismo nombre, `this` los distingue.

---

## Métodos: el comportamiento del producto

[EN PANTALLA: agregar el método dentro de la clase:]

```java
    public double calcularSubtotal() {
        return precio * cantidad;
    }
```

Este es el mismo cálculo de la lección 3 — pero ahora el método **no necesita parámetros**, porque `precio` y `cantidad` ya son atributos del objeto. El objeto sabe sus propios datos.

---

## Getters y setter: acceder a los datos

[EN PANTALLA: agregar los getters y el setter, y cerrar la clase con `}`:]

Como los atributos son `private`, nadie puede leerlos directamente desde fuera de la clase. Los **getters** son la ventanilla controlada para consultarlos.

```java
    public String getNombre()   { return nombre;   }
    public double getPrecio()   { return precio;   }
    public int    getCantidad() { return cantidad; }
 
    public void setCantidad(int nuevaCantidad) {
        if (nuevaCantidad > 0) {
            this.cantidad = nuevaCantidad;
        }
    }
}
```

El **setter** `setCantidad` permite cambiar la cantidad del producto — pero solo si el nuevo valor es mayor que cero. Si alguien intenta poner una cantidad negativa o cero, el setter simplemente no hace nada. Eso protege la integridad de los datos.

---

## Crear y usar el objeto

[EN PANTALLA: dentro de public class Main escribir:]

```java
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
    }
}
```

[EN PANTALLA: ejecutar y mostrar los resultados.]

`new Producto("Cuaderno", 5.50, 2)` crea el objeto — llama al constructor. `producto1.calcularSubtotal()` llama al método del objeto, que usa los atributos internos para calcular el resultado. `producto1.setCantidad(5)` cambia la cantidad, y el siguiente `calcularSubtotal()` ya usa el nuevo valor.

---

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa y abre el JDoodle de esta lección.

Uno: crea un segundo objeto `producto2 = new Producto("Lapicero", 1.20, 3)` e imprime su nombre, precio, cantidad y subtotal.

Dos: llama a `producto1.setCantidad(-5)` y comprueba con `getCantidad()` que el valor no cambió — gracias a la validación del setter.

Tres: agrega el método `public void aumentarCantidad(int extra)` que sume `extra` a `cantidad`. Llámalo con `producto1.aumentarCantidad(2)` y verifica el nuevo subtotal.

[PAUSA: 5 segundos.]

---

## Cierre

Tres cosas para llevarse de esta lección.

Primera: una clase es el molde; un objeto es la instancia creada con `new`. Pueden existir tantos objetos como necesiten, cada uno con sus propios datos.

Segunda: `private` protege los atributos. Los getters los exponen de forma controlada — eso es encapsulación.

Tercera: el constructor define cómo se crea cada nuevo objeto. Un setter puede validar antes de cambiar un dato.

En la última lección van a aprender **arrays** — para guardar varios productos juntos — y van a construir el carrito de compras completo. ¡Los espero ahí!