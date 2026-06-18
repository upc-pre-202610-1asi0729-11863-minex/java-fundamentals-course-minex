# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: 45 minutos  
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)  
**Repositorio de código fuente**: [https://github.com/upc-pre-202610-1asi0729-11863-minex/java-fundamentals-course-minex](https://github.com/upc-pre-202610-1asi0729-11863-minex/java-fundamentals-course-minex)

---

## Secuencia de lecciones

### Lección 1: Introducción a Java y variables

- **Descripción**: Descubre qué es programar y para qué sirve Java; escribe tu primer programa con `System.out.println` y aprende a guardar datos en variables con los tipos `int`, `double`, `String` y `boolean`, usando como contexto los datos del carrito de Mini Market.
- **Enlace**: [Ver la lección](https://youtu.be/HDw58t51am4)
- **Conclusiones clave**:
  - Un programa es una secuencia de instrucciones que la computadora sigue al pie de la letra; `System.out.println` imprime texto en la consola.
  - Las variables son cajas con nombre y tipo fijo: `int` para enteros, `double` para decimales, `String` para texto y `boolean` para verdadero/falso.
  - Toda línea de código en Java termina con punto y coma `;`.
- **Empieza a programar**: [Abrir JDoodle](https://www.jdoodle.com/ga/ZyrdgcYbK0gaCm9DBloIXw%3D%3D)

### Lección 2: Operadores y estructuras de control

- **Descripción**: Opera con los datos de tus variables para calcular subtotales y repartir cuentas, toma decisiones con `if-else` para aplicar descuentos, y repite acciones con bucles `for` y `while` para revisar los productos del carrito.
- **Enlace**: [Ver la lección](https://youtu.be/3_yAN7Zo0d0)
- **Conclusiones clave**:
  - Los operadores aritméticos calculan con datos: `*` para subtotales, `/` y `%` para repartir — dividir dos `int` da un entero, y `%` da el residuo.
  - `==` compara si dos valores son iguales; `=` guarda un valor en una variable. No los confundas.
  - Usa `for` cuando sabes cuántas repeticiones necesitas; usa `while` cuando no lo sabes de antemano.
- **Empieza a programar**: [Abrir JDoodle](https://www.jdoodle.com/ga/vATt6g%2Br%2FtMFFChuCCA4eQ%3D%3D)

### Lección 3: Métodos y entrada del usuario

- **Descripción**: Organiza el código en bloques reutilizables llamados métodos, aprende a pasarles datos como parámetros y a recibir un resultado con `return`; luego usa `Scanner` para que el programa lea el precio y la cantidad de un producto desde el teclado.
- **Enlace**: [Ver la lección](https://youtu.be/1GREDuLl1iM)
- **Conclusiones clave**:
  - Un método se define una vez y se puede llamar cuantas veces se necesite — evita repetir código.
  - Si el método no devuelve nada su tipo es `void`; si devuelve un dato, el tipo va antes del nombre del método.
  - `Scanner teclado = new Scanner(System.in)` abre la puerta al teclado; `nextDouble()` lee decimales, `nextInt()` lee enteros.
- **Empieza a programar**: [Abrir JDoodle](https://www.jdoodle.com/ga/lPwMC3qrwbNBtWAeCsgTiw%3D%3D)

### Lección 4: Clases, objetos y encapsulación

- **Descripción**: Da el salto a la programación orientada a objetos: crea la clase `Producto` con atributos privados, un constructor y el método `calcularSubtotal`; instancia objetos con `new` y protege los datos con getters y un setter validado — eso es encapsulación.
- **Enlace**: [Ver la lección](https://youtu.be/JLqptTzYdz0)
- **Conclusiones clave**:
  - Una clase es el molde; un objeto es la instancia concreta creada con `new`. Pueden crearse tantos objetos como se necesiten.
  - `private` protege los atributos: nadie de afuera puede modificarlos directamente.
  - Los getters leen el atributo; un setter puede validar antes de modificarlo (por ejemplo, rechazar cantidades negativas).
- **Empieza a programar**: [Abrir JDoodle](https://www.jdoodle.com/ga/XCcxZDMCwiFoTou5woB58Q%3D%3D)

### Lección 5: Arrays, programa final y errores comunes

- **Descripción**: Aprende a guardar colecciones de datos en arrays — incluyendo arrays de objetos —; crea un array de objetos `Producto` y recórrelo para construir desde cero el carrito de compras completo de Mini Market, con cálculo de total y descuento; cierra con los tres errores más comunes para principiantes en Java.
- **Enlace**: [Ver la lección](https://youtu.be/xn5g3DZH6y8)
- **Conclusiones clave**:
  - Un array es una fila de casilleros numerados desde cero; el último índice válido es `length - 1`. Un array puede guardar objetos, no solo números o texto.
  - `ArrayIndexOutOfBoundsException` significa que accediste a un casillero que no existe; `NullPointerException` significa que el casillero existe pero está vacío (`null`).
  - Combinar variables, bucles, métodos, clases, objetos y arrays de objetos es programación orientada a objetos aplicada.
- **Proyecto final**: [Abrir en JDoodle](https://www.jdoodle.com/ga/JwukAEwJi0ifBIz0IsXeUA%3D%3D) — **¡Personalízalo con los productos que tú compras!**

---

## Recursos adicionales

**Código fuente completo**: [Repositorio de GitHub](https://github.com/upc-pre-202610-1asi0729-11863-minex/java-fundamentals-course-minex)

**Todas las actividades prácticas**:

| Lección | Actividad | Integrante | Empezar a programar |
|---------|-----------|------------|---------------------|
| 1 | Variables y primer programa | Rose Vergaray | [JDoodle](https://www.jdoodle.com/ga/ZyrdgcYbK0gaCm9DBloIXw%3D%3D) |
| 2 | Operadores e if-else | Santiago Baldeon | [JDoodle](https://www.jdoodle.com/ga/vATt6g%2Br%2FtMFFChuCCA4eQ%3D%3D) |
| 3 | Métodos y Scanner | Katty Philco | [JDoodle](https://www.jdoodle.com/ga/lPwMC3qrwbNBtWAeCsgTiw%3D%3D) |
| 4 | Clase y objetos | Adrian Armestar | [JDoodle](https://www.jdoodle.com/ga/XCcxZDMCwiFoTou5woB58Q%3D%3D) |
| 5 | Arrays y programa completo | Ethan Yi | [JDoodle](https://www.jdoodle.com/ga/JwukAEwJi0ifBIz0IsXeUA%3D%3D) |

<br>**Recursos para seguir aprendiendo**:

- [Cuestionario integral del curso](https://forms.gle/KTUF3ENQGtXNkxuS8) — ¡Pon a prueba lo que aprendiste!
- [Oracle Java Documentation](https://docs.oracle.com/javase/) — referencia oficial de todos los métodos y clases de Java.
- [freeCodeCamp Java](https://www.freecodecamp.org) — cursos interactivos gratuitos directamente en el navegador.

**¡Gracias por completar el curso!**

---

## Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
**Período académico:** 202610  
**Curso:** 1ASI0729 | Desarrollo de Aplicaciones Open Source  
**NRC:** 11863  

**Nombre del equipo**: Minex  

**Líder del equipo**: Vergaray Calderon, Rose Almendra  

**Integrantes del equipo**:

- Armestar Felipa, Adrian Andres  
- Baldeon Vivar, Santiago Armando  
- Philco Mota, Katty Yolanda  
- Vergaray Calderon, Rose Almendra  
- Yi Torrejon, Ethan Raul  

**Fecha de entrega**: 18 de junio de 2026
