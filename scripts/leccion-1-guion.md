# LECCIÓN 1 — ¿Qué es Java? Variables y tu primer programa

---

[EN PANTALLA: mostrar la diapositiva de introducción con el título del curso]

Hola, bienvenidos al curso de Fundamentos de Java.

Antes de escribir una sola línea de código, quiero que piensen en algo que probablemente ya hacen: jugar videojuegos. Cuando el personaje salta al presionar un botón, cuando el puntaje sube, cuando aparece un enemigo en pantalla — nada de eso ocurre por magia. Alguien tuvo que decirle a la computadora exactamente cuándo hacer cada cosa. Ese "alguien" es un programador. Y en este curso van a empezar a ser uno.

¿Lo mejor? No necesitas instalar nada. Solo el navegador que ya tienen abierto. ¡Empecemos!

---

## ¿Qué es programar?

Imaginen que le dan indicaciones a alguien que nunca ha salido de su casa para que llegue a un lugar. Tienen que ser ultra específicos: "sal por la puerta, camina dos cuadras, gira a la derecha en la farmacia, sube las escaleras". No pueden asumir que va a "adivinar" el camino. Si se saltan un paso o lo dicen en el orden equivocado, se pierde.

Programar es exactamente eso: darle indicaciones precisas a una máquina que no entiende de contextos, no improvisa y no adivina intenciones. Ejecuta cada instrucción en el orden exacto en que fue escrita.

La diferencia con las indicaciones de la calle es que las instrucciones para una computadora se escriben en un lenguaje especial. Eso que escriben se llama **código**.

---

## ¿Qué es Java?

Java es uno de esos lenguajes especiales. Fue creado en 1995 y desde entonces se volvió uno de los más usados en el mundo. Está detrás de millones de dispositivos Android y de los sistemas de empresas gigantes que usas todos los días como Netflix, Uber, Spotify o Amazon. De hecho, si alguna vez jugaste la versión original de Minecraft... sí, estaba escrita completamente en Java.

Ahora, ¿por qué empezar con Java y no otro lenguaje? Porque Java te obliga a pensar con orden. Aquí no hay magia: tienes que decirle al programa exactamente qué tipo de dato usas, estructurar todo de forma limpia y ser explícito. Esos hábitos, esa disciplina, es exactamente lo que necesitas para aprender a programar bien desde el primer día.

En las cinco lecciones de este curso van a construir, paso a paso, un simulador de carrito de compras. Al terminar el curso, tendrás un programa real que registra productos, calcula subtotales, suma el total de la compra y hasta aplica descuentos automáticos. Todo en Java y directo en tu navegador.

---

## El primer programa: Hola mundo

[EN PANTALLA: abrir JDoodle en jdoodle.com, seleccionar Java. El editor muestra la estructura mínima de la clase Main vacía.]

Todo programa en Java vive dentro de lo que se llama una **clase**. Por ahora no se preocupen por entender exactamente qué es — lo van a ver en detalle en la lección cuatro. Solo sepan que es la "caja" que contiene el código.

[EN PANTALLA: escribir lentamente dentro del editor:]

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
}
```

[EN PANTALLA: presionar el botón Execute y mostrar "Hola mundo" en la consola inferior.]

Ahí está. Acaban de ejecutar su primer programa en Java.

Déjenme explicar las tres líneas más importantes.

La primera, `public class Main`, es la declaración de la clase — el nombre de la caja. En JDoodle el archivo se llama `Main.java` y la clase también se llama `Main`. Siempre tienen que coincidir.

La segunda, `public static void main(String[] args)`, es la puerta de entrada del programa. Java siempre empieza por aquí. No cambien su forma.

La tercera, `System.out.println("Hola mundo")`, imprime texto en la consola. Todo lo que escriban entre las comillas aparece en pantalla.

Y noten que esa línea termina con `;`. En Java **cada instrucción termina con punto y coma**. Olvidarlo es el error más frecuente al principio.

---

## Variables: los datos del carrito de compras

[EN PANTALLA: debajo del println, agregar un comentario guía]

Nuestro Mini Market necesita recordar varias cosas: ¿cómo se llama la tienda? ¿Cuántos productos hay en el carrito? ¿Cuánto suma el total? ¿El cliente tiene descuento?

Para guardar esos datos usamos **variables** — cajas con nombre donde vive un dato.

En Java cada variable tiene un **tipo**, que le dice a la computadora qué clase de dato va a guardar. Ese tipo no puede cambiar después de declararlo.

---

### int — números enteros

[EN PANTALLA: escribir dentro del main:]

```java
int cantidadProductos = 3;
```

[EN PANTALLA: señalar cada parte mientras se habla.]

Esta línea tiene cuatro partes. `int` es el tipo — números enteros, sin decimales: 0, 3, -7, 100. `cantidadProductos` es el nombre de la variable. El `=` significa "guarda este valor en esta caja" — no es el "igual" de las matemáticas. Y `3` es el dato: el carrito tiene tres productos.

---

### double — números con decimales

[EN PANTALLA: agregar:]

```java
double precioTotal = 0.0;
```

`double` es para números con punto decimal. Y en una tienda, **los precios casi siempre tienen decimales** — S/ 5.50, S/ 12.90. Por eso `precioTotal` es `double`, no `int`. Empieza en `0.0` porque el carrito recién se está armando.

---

### String — texto

[EN PANTALLA: agregar:]

```java
String nombreTienda = "Mini Market";
```

`String` es para texto: palabras, frases, mensajes. El valor va entre comillas dobles. Fíjense que `String` empieza con mayúscula — `String` con mayúscula es correcto; `string` con minúscula da error. Java distingue mayúsculas de minúsculas en todo.

---

### boolean — verdadero o falso

[EN PANTALLA: agregar:]

```java
boolean tieneDescuento = false;
```

`boolean` solo tiene dos valores posibles: `true` o `false`. Sirve para representar estados: ¿el cliente tiene descuento? ¿la compra ya se pagó? Empieza en `false` porque todavía no se sabe.

---
 
## Imprimir las variables

[EN PANTALLA: agregar los println y ejecutar:]

```java
System.out.println(nombreTienda);
System.out.println("Productos en el carrito: " + cantidadProductos);
System.out.println("Total:                   " + precioTotal);
System.out.println("¿Tiene descuento?        " + tieneDescuento);
```

[EN PANTALLA: ejecutar y mostrar la salida en la consola.]

El `+` une el texto fijo con el valor de la variable. A eso se le llama **concatenación**.

[EN PANTALLA: cambiar `int cantidadProductos = 3` a `int cantidadProductos = 5` y ejecutar de nuevo.]

¿Ven? Cambiaron la variable una sola vez y el resultado se actualizó en la salida.

---

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa el video y abre el JDoodle de esta lección, el enlace está en la descripción.

Uno: cambia `nombreTienda` por el nombre de tu tienda favorita y ejecuta.

Dos: cambia `tieneDescuento` de `false` a `true`. ¿Qué cambia en la salida?

Tres: agrega una variable `String producto = "tu producto favorito"` e imprímela con `"Producto: " + producto`.

[PAUSA: 5 segundos.]

---

## Cierre

Tres cosas para llevarse de esta lección.

Primera: un programa es una secuencia de instrucciones que la computadora sigue al pie de la letra. `System.out.println` imprime texto en la consola.

Segunda: las variables son cajas con nombre y tipo fijo. Los cuatro tipos básicos son `int` para enteros, `double` para decimales, `String` para texto y `boolean` para verdadero/falso.

Tercera: en Java cada instrucción termina con `;`, y el tipo de una variable no puede cambiar después de declararla.

En la siguiente lección vamos a aprender a operar con esos datos — calcular subtotales, repartir cuentas, y hacer que el programa tome decisiones según el total de la compra. ¡Los espero ahí!
