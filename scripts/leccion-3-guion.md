# LECCIÓN 3 — Métodos y Entrada del Usuario

---

[EN PANTALLA: abrir JDoodle con la estructura mínima del main.]

Hola, bienvenidos de vuelta.

En la lección anterior calcularon un subtotal y decidieron si hay descuento, pero todo ese código está suelto en el `main`. Si necesitan calcular el subtotal de varios productos, ¿van a escribir `precio * cantidad` una y otra vez? Hoy aprenden la solución: los **métodos**. Y también van a aprender a leer los datos del producto desde el teclado con **Scanner**.

---

## ¿Qué es un método?

Piensen en la función "play" de Spotify. Cuando la presionan, suceden muchas cosas por dentro — pero ustedes no necesitan saber cómo. Solo presionan play y escuchan música.

Un método en Java es igual: un bloque de código con nombre que hace una tarea. Lo definen una vez y lo llaman cuantas veces quieran.

---

## Método void: mostrar el título de la tienda

[EN PANTALLA: escribir el método FUERA del main, dentro de la clase, justo encima del main:]

```java
public static void mostrarTitulo() {
    System.out.println("=== Mini Market ===");
    System.out.println("Caja registradora");
}
```

[EN PANTALLA: señalar cada parte de la firma:]

`void` indica que este método no devuelve ningún resultado — solo imprime el título. `mostrarTitulo` es el nombre. Los paréntesis `()` van vacíos porque no necesita ningún dato externo.

[EN PANTALLA: dentro del main:]

```java
mostrarTitulo();
```

[EN PANTALLA: ejecutar y mostrar el título en la consola.]

---

## Método con retorno: calcular el subtotal

[EN PANTALLA: agregar el método debajo, señalando el tipo de retorno:]

Ahora vamos a convertir el cálculo de la lección anterior en un método reutilizable.

```java
public static double calcularSubtotal(double precio, int cantidad) {
    return precio * cantidad;
}
```

`double` antes del nombre del método indica que devuelve un número decimal. `precio` y `cantidad` son los **parámetros** — los datos que el método necesita para hacer su trabajo. `return` entrega el resultado al código que llamó al método.

[EN PANTALLA: agregar el segundo método:]

```java
public static double aplicarDescuento(double total) {
    if (total >= 50) return total * 0.9;
    else             return total;
}
```

Si el total es 50 o más, devuelve el 90% del total — un 10% de descuento. Si no, devuelve el total sin cambios.

[EN PANTALLA: en el main, usar ambos métodos con valores fijos:]

```java
double subtotal = calcularSubtotal(5.50, 3);
System.out.println("Subtotal: S/ " + subtotal);
 
double totalFinal = aplicarDescuento(subtotal);
System.out.println("Total a pagar: S/ " + totalFinal);
```

[EN PANTALLA: ejecutar y mostrar los resultados.]

Un método devuelve un valor; ese valor se guarda en una variable; esa variable se pasa a otro método. Las piezas se encadenan limpiamente.

---

## Scanner: el cliente ingresa los datos

[EN PANTALLA: agregar el import al inicio del archivo, antes de la clase:]

```java
import java.util.Scanner;
```

Hasta ahora el precio y la cantidad estaban escritos en el código. En la caja real, el cliente — o el cajero — ingresa esos datos. Para leer esa entrada existe **Scanner**.

El `import` le dice a Java que vamos a usar esa herramienta. Va siempre antes de la clase.

[EN PANTALLA: reemplazar los valores fijos del main por Scanner:]

```java
Scanner teclado = new Scanner(System.in);
 
mostrarTitulo();
 
System.out.println("¿Cuál es el precio del producto?");
double precio = teclado.nextDouble();
 
System.out.println("¿Cuántas unidades vas a comprar?");
int cantidad = teclado.nextInt();
 
double subtotal = calcularSubtotal(precio, cantidad);
System.out.println("Subtotal: S/ " + subtotal);
 
double totalFinal = aplicarDescuento(subtotal);
System.out.println("Total a pagar: S/ " + totalFinal);
```

[EN PANTALLA: en la cajita Stdin de JDoodle escribir dos líneas: `5.50` y `3`. Presionar Execute y mostrar el resultado en la consola.]

`teclado.nextDouble()` lee un número decimal — perfecto para precios. `teclado.nextInt()` lee un número entero — perfecto para cantidades. En JDoodle, cada valor va en una línea separada de la cajita **Stdin**, en el mismo orden en que el programa los pide.

---

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa y abre el JDoodle de esta lección. En Stdin escribe un precio en la primera línea y una cantidad en la segunda.

Uno: crea un método `public static void mostrarResumen(String mensaje, double valor)` que imprima `mensaje + ": S/ " + valor`. Úsalo para mostrar el subtotal y el total final.

Dos: prueba el programa con un precio y cantidad que den un subtotal mayor a 50 — por ejemplo `precio = 20.0` y `cantidad = 3`. Verifica que se aplica el descuento.

Tres: cambia `aplicarDescuento` para que el descuento sea del 20% en lugar del 10%.

[PAUSA: 5 segundos.]

---

## Cierre

Tres cosas para llevarse de esta lección.

Primera: un método se define una vez y se puede llamar cuantas veces se necesite — evita repetir código.

Segunda: `void` cuando el método no devuelve nada; el tipo del dato devuelto va antes del nombre. `return` entrega el resultado.

Tercera: `Scanner` con `nextDouble()` y `nextInt()` lee datos del teclado durante la ejecución. El `import java.util.Scanner` va antes de la clase. En JDoodle, cada input va en una línea de Stdin.

En la próxima lección vamos a empaquetar el nombre, el precio y la cantidad de un producto — junto con el cálculo del subtotal — en un solo tipo de dato propio. Se llama **clase**. ¡Los espero ahí!
