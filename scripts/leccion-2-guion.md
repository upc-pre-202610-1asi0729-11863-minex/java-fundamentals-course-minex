# LECCIÓN 2 — Operadores y Estructuras de Control

---

[EN PANTALLA: abrir JDoodle con la estructura mínima del main.]

Hola, bienvenidos de vuelta.

En la lección anterior aprendieron a guardar datos en variables. Ahora vamos a hacer algo con esos datos: calcular el subtotal de un producto, repartir una cuenta entre amigos, y hacer que el programa decida si hay descuento o no. Empecemos.

---

## Operadores aritméticos: calcular el subtotal

[EN PANTALLA: escribir:]

```java
double precio   = 5.50;
int    cantidad = 3;
 
System.out.println("Subtotal: " + (precio * cantidad));
```

[EN PANTALLA: ejecutar y mostrar el resultado: 16.5]

`precio * cantidad` es el operador de multiplicación — calcula el subtotal de un producto. Si compran 3 cuadernos a S/ 5.50 cada uno, el subtotal es S/ 16.50.

[EN PANTALLA: agregar suma y resta:]

```java
System.out.println("Con envío:    " + (precio * cantidad + 2.0));
System.out.println("Con cupón:    " + (precio * cantidad - 1.0));
```

Suma y resta funcionan exactamente como en matemáticas.

---

## División y módulo: repartir la cuenta

[EN PANTALLA: limpiar y escribir:]

Ahora imaginen que van a un restaurante con amigos y la cuenta total es de S/ 17, entre 3 personas. ¿Cuánto paga cada uno? ¿Sobra algo de vuelto si pagan en efectivo?

```java
int totalCuenta = 17;
int amigos      = 3;
 
System.out.println("Cada uno paga: " + (totalCuenta / amigos));
System.out.println("Sobra:         " + (totalCuenta % amigos));
```

[EN PANTALLA: ejecutar y mostrar: "Cada uno paga: 5" y "Sobra: 2"]

`totalCuenta / amigos` es la división. Pero noten: `17 / 3` da `5`, no `5.66`. ¿Por qué? Porque ambas variables son `int`, y cuando divides dos enteros en Java, el resultado también es entero — el decimal se descarta.

El segundo operador, `%`, es el **módulo** — el residuo de la división. `17 % 3 = 2` porque 3 cabe cinco veces en 17 y sobran 2. Si reparten S/ 5 a cada uno de los 3 amigos, gastan S/ 15 y sobran S/ 2 — exactamente lo que calculó `%`.

---

## Tomar decisiones: if-else

[EN PANTALLA: limpiar y escribir:]

Si la compra supera los S/ 50, el cliente obtiene 10% de descuento. ¿Cómo hace el programa para decidir eso? Con `if-else` — "si... si no...".

```java
double totalCompra = 45.0;
 
if (totalCompra >= 50) {
    System.out.println("¡Felicidades! Tienes 10% de descuento.");
} else if (totalCompra >= 30) {
    System.out.println("Te faltan S/ " + (50 - totalCompra) + " para el descuento.");
} else {
    System.out.println("Sigue comprando para acceder a descuentos.");
}
```

[EN PANTALLA: ejecutar con 45.0. Luego cambiar a 60.0, luego a 10.0. Mostrar los tres resultados.]

Con `45.0` dice que faltan S/5 para el descuento. Con `60.0` dice que tiene descuento. Con `10.0` dice que siga comprando.

La estructura es: `if`, condición entre paréntesis, código entre llaves. Luego `else if` para casos intermedios, `else` para todo lo demás. Java evalúa de arriba hacia abajo y ejecuta el primer bloque cuya condición sea verdadera.

Los operadores de comparación: `==` igual, `!=` diferente, `>` mayor, `<` menor, `>=` mayor o igual, `<=` menor o igual.

**Aviso importante**: `=` guarda un valor. `==` compara si dos valores son iguales. Son completamente distintos — confundirlos es el error número uno en Java.

---

## Repetir acciones: el bucle for

[EN PANTALLA: limpiar y escribir:]

El carrito tiene 3 productos. Queremos revisarlos uno por uno antes de cobrar. En lugar de escribir tres líneas iguales, usamos un bucle.

```java
for (int i = 1; i <= 3; i++) {
    System.out.println("Revisando producto " + i + " de 3...");
}
```

[EN PANTALLA: ejecutar y mostrar los tres mensajes.]

El `for` tiene tres partes: dónde empieza (`int i = 1`), cuándo para (`i <= 3`) y cómo avanza en cada vuelta (`i++` — suma 1 a `i`).

---

## El bucle while

[EN PANTALLA: agregar debajo:]

```java
int productosPendientes = 3;
while (productosPendientes > 0) {
    System.out.println("Quedan " + productosPendientes + " productos por escanear.");
    productosPendientes--;
}
```

[EN PANTALLA: ejecutar y mostrar la cuenta regresiva de 3 a 1.]

El `while` solo tiene la condición. Repite mientras sea verdadera. `productosPendientes--` resta 1 en cada vuelta.

¿Cuándo usar cada uno? `for` cuando saben exactamente cuántas veces van a repetir — como recorrer los 3 productos del carrito. `while` cuando no lo saben de antemano — por ejemplo, "sigue escaneando mientras queden productos".

---

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa y abre el JDoodle de esta lección.

Uno: cambia `precio` y `cantidad` a otros valores y observa cómo cambia el subtotal.

Dos: cambia `totalCompra` a `52.0` y luego a `15.0`. Verifica que el mensaje correcto aparece en cada caso.

Tres: modifica el `for` para que revise 5 productos en lugar de 3.

[PAUSA: 5 segundos.]

---

## Cierre

Tres cosas para llevarse de esta lección.

Primera: los operadores aritméticos calculan con datos. `*` para subtotales, `/` y `%` para repartir — recuerden que dividir dos `int` da un entero, y `%` da el residuo.

Segunda: `if-else` evalúa condiciones de arriba hacia abajo. `==` compara, `=` asigna — no los confundas.

Tercera: `for` cuando sabes cuántas repeticiones; `while` cuando no. Dentro de cualquier bucle puede ir más código, incluyendo `if-else`.

En la próxima lección aprenden a organizar esta lógica en bloques reutilizables con nombre — los **métodos** — y a leer los datos del producto desde el teclado. ¡Los espero ahí!
