# LECCIÓN 5 — Arrays, Programa Final y Errores Comunes

---

[EN PANTALLA: abrir JDoodle con el archivo de la lección 5: la clase Producto arriba y Main abajo.]

Hola, bienvenidos a la última lección del curso.

En las lecciones anteriores aprendieron a guardar datos en variables, a operar con ellos y tomar decisiones, a organizar el código en métodos, y a crear su propio tipo de dato — la clase `Producto`. Hoy aprenden una estructura nueva — los **arrays** — y van a usarla para construir el carrito de compras completo. Al final revisamos los tres errores que comete todo el mundo al empezar.

Abran el JDoodle de esta lección — el enlace está en la descripción. Vamos.

---

## Arrays: una fila de casilleros

Hasta ahora cada variable guardaba un solo dato. Pero un carrito de compras tiene **varios** productos. ¿Declaran `producto1`, `producto2`, `producto3`? Funciona para tres, pero no escala.

Para eso existen los **arrays**: estructuras que guardan múltiples valores del mismo tipo en una sola variable.

[EN PANTALLA: escribir un demo simple primero:]

```java
int[] cantidades = new int[3];
cantidades[0] = 2;
cantidades[1] = 3;
cantidades[2] = 1;
 
for (int i = 0; i < cantidades.length; i++) {
    System.out.println("Casillero " + i + ": " + cantidades[i]);
}
```

[EN PANTALLA: ejecutar y mostrar los tres valores.]

`int[]` indica un array de enteros. `new int[3]` crea tres casilleros, numerados del **0** al **2**. `cantidades.length` devuelve el tamaño total — 3.

La regla más importante: **el último índice válido siempre es `length - 1`**. Intentar acceder al índice 3 en este array provoca el error más famoso de Java — lo vamos a ver al final.

---

## Cadenas también tienen métodos útiles

[EN PANTALLA: escribir:]

Antes de pasar a los arrays de objetos, un dato útil para el ticket de compra. Las variables `String` no son solo texto guardado — también tienen **métodos** que pueden llamar con un punto, igual que hicimos con `.equals()` en la lección 3.

```java
String nombreProducto = "cuaderno";
 
System.out.println(nombreProducto.toUpperCase());
System.out.println("Letras: " + nombreProducto.length());
```

[EN PANTALLA: ejecutar y mostrar "CUADERNO" y "Letras: 8".]

`.toUpperCase()` devuelve el texto en mayúsculas — así se ven los nombres en un ticket de compra real. `.length()` devuelve cuántos caracteres tiene el texto. Vamos a usar `.toUpperCase()` en el ticket final del carrito.

---

## Arrays de objetos: el carrito de compras

[EN PANTALLA: limpiar el editor.]

Ahora lo interesante: un array puede guardar **objetos**, no solo números. Vamos a crear un array de objetos `Producto` — eso es, literalmente, el carrito de compras.

```java
Producto[] carrito = new Producto[3];
 
carrito[0] = new Producto("Cuaderno", 5.50, 2);
carrito[1] = new Producto("Lapicero", 1.20, 3);
carrito[2] = new Producto("Mochila",  40.00, 1);
```

[EN PANTALLA: señalar cada parte:]

`Producto[] carrito = new Producto[3]` crea un array con espacio para 3 objetos `Producto` — pero todavía vacío. Cada `carrito[i] = new Producto(...)` crea un objeto nuevo con la clase de la lección 4 y lo guarda en ese casillero.

---

## El programa final: recorrer el carrito

[EN PANTALLA: agregar el bucle que recorre el carrito:]

```java
double total = 0;
 
for (int i = 0; i < carrito.length; i++) {
    double subtotal = carrito[i].calcularSubtotal();
    System.out.println(carrito[i].getNombre().toUpperCase()
                       + " x" + carrito[i].getCantidad()
                       + " = S/ " + subtotal);
    total += subtotal;
}
 
System.out.println("\nTotal: S/ " + total);
```

[EN PANTALLA: ejecutar y mostrar la lista de productos en mayúsculas, con sus subtotales y el total final.]

Noten `carrito[i].getNombre().toUpperCase()` — encadenan dos llamadas: primero `getNombre()` devuelve el `String` con el nombre del producto, y `.toUpperCase()` lo convierte a mayúsculas, como en un ticket real.

Para acceder a los datos de cada objeto en el array, primero entramos al casillero — `carrito[i]` — y luego llamamos al método o getter — `.calcularSubtotal()`, `.getNombre()`. `total += subtotal` es una forma corta de escribir `total = total + subtotal`.

---
 
## Aplicando el descuento al carrito completo

[EN PANTALLA: agregar el método aplicarDescuento y usarlo:]

```java
public static double aplicarDescuento(double total) {
    if (total >= 50) return total * 0.9;
    else             return total;
}
```

[EN PANTALLA: en el main, después de calcular `total`:]

```java
double totalFinal = aplicarDescuento(total);
 
if (totalFinal < total) {
    System.out.println("¡Descuento aplicado! Total a pagar: S/ " + totalFinal);
} else {
    System.out.println("Total a pagar: S/ " + totalFinal);
}
```

[EN PANTALLA: ejecutar el programa completo y mostrar el resultado final con descuento aplicado.]

Este es el método de la lección 3, reutilizado aquí sobre el total del carrito completo. Todo lo que aprendieron en el curso — variables, operadores, if-else, bucles, métodos, clases, métodos de `String` y arrays de objetos — está en este programa.

---

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa y abre el JDoodle de esta lección.

Uno: cambia los tres productos del carrito por productos que tú compres normalmente — su nombre, precio y cantidad.

Dos: cambia el límite del descuento de `50` a `30` en `aplicarDescuento`, y prueba con tu carrito.

Tres: agrega un cuarto producto al carrito. Pista: cambia `new Producto[3]` a `new Producto[4]` y agrega `carrito[3] = new Producto(...)`.

[PAUSA: 8 segundos.]

---

## Errores comunes

[EN PANTALLA: abrir una sección de demostración en el JDoodle.]

Ahora vamos a ver tres errores que comete todo el mundo al empezar. Reconocerlos les va a ahorrar mucha frustración.

### Error 1: ArrayIndexOutOfBoundsException

[EN PANTALLA: escribir:]

```java
Producto[] carrito = new Producto[3];
carrito[0] = new Producto("Cuaderno", 5.50, 2);
System.out.println(carrito[3].getNombre());
```

[EN PANTALLA: ejecutar — aparece el error `ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3`.]

El array tiene 3 posiciones: índices 0, 1 y 2. El índice 3 no existe. Regla: el último índice válido siempre es `length - 1`.

[EN PANTALLA: corregir a `carrito[0]` y mostrar que funciona.]

### Error 2: NullPointerException

[EN PANTALLA: escribir:]

```java
Producto[] carrito = new Producto[3];
carrito[0] = new Producto("Cuaderno", 5.50, 2);
System.out.println(carrito[1].getNombre());
```

[EN PANTALLA: ejecutar — aparece el error `NullPointerException`.]

Este es **el error más famoso de Java**. `new Producto[3]` reserva tres casilleros, pero los deja **vacíos** — sin ningún objeto adentro. Cada casillero vacío vale `null`, que significa "nada". Llenamos `carrito[0]` pero no `carrito[1]`. Cuando intentamos llamar a `.getNombre()` sobre `carrito[1]`, que vale `null`, Java no puede hacerlo — no hay ningún objeto ahí para preguntarle nada.

Si alguna vez ven `NullPointerException`, revisen si están accediendo a un casillero del array que todavía no recibió un `new`.

[EN PANTALLA: agregar `carrito[1] = new Producto("Lapicero", 1.20, 3);` antes del println y mostrar que funciona.]

### Error 3: Olvidar el punto y coma

[EN PANTALLA: escribir una línea sin punto y coma:]

```java
double total = 0
System.out.println(total);
```

[EN PANTALLA: ejecutar — aparece error de compilación.]

Java no puede compilar sin los puntos y coma. El error a veces señala la línea siguiente porque el compilador no sabe que la línea anterior terminó. Si ven un error que señala una línea que parece correcta, revisen la línea de arriba.

[EN PANTALLA: agregar el punto y coma y mostrar que funciona.]

---
 
## Dónde seguir aprendiendo

[EN PANTALLA: abrir docs.oracle.com/javase en el navegador.]

Dos recursos completamente gratuitos.

La **documentación oficial de Java** en docs.oracle.com — si tienen dudas sobre cualquier clase o método, búscalo ahí.

[EN PANTALLA: abrir freecodecamp.org.]

**freeCodeCamp** en freecodecamp.org — cursos interactivos gratuitos de Java directamente en el navegador.

---

## Cierre del curso

[EN PANTALLA: mostrar la diapositiva con el arco de las cinco lecciones.]

Miren lo que aprendieron en este curso.

En la Lección 1 aprendieron qué es Java y cómo guardar datos en variables con tipos definidos.

En la Lección 2 aprendieron a operar con esos datos, a tomar decisiones con `if-else` y a repetir acciones con bucles.

En la Lección 3 aprendieron a organizar el código en métodos reutilizables y a leer datos con Scanner.

En la Lección 4 aprendieron a crear su propio tipo de dato — la clase `Producto` — con constructor, getters y un setter validado.

Y en esta lección aprendieron arrays — incluyendo arrays de objetos — y construyeron el carrito de compras completo.

Eso es programación orientada a objetos desde cero. Sigan practicando, experimenten con el código, rómpanlo a propósito para ver qué pasa y luego arréglénlo. Así aprenden todos los programadores.

¡Buena suerte!  
