# Biblioteca

Este proyecto implementa una biblioteca virtual que permite agregar libros, lectores, realizar préstamos y devoluciones. Se simula el funcionamiento básico de una biblioteca.

## Clases

### Biblioteca

La clase `Biblioteca` representa la biblioteca en sí y contiene métodos para agregar libros, agregar lectores, prestar libros y devolver libros.

#### Métodos principales

- `agregarLibro(libro: Libro)`: Agrega un libro a la biblioteca.
- `agregarLector(lector: Lector)`: Agrega un lector a la biblioteca.
- `prestarLibro(lector: Lector, libro: Libro)`: Realiza el préstamo de un libro a un lector.
- `devolverLibro(lector: Lector, libro: Libro)`: Devuelve un libro prestado por un lector.

### Lector

La clase `Lector` representa a un lector de la biblioteca y contiene métodos para prestar libros, devolver libros y mostrar los libros prestados por el lector.

#### Métodos principales

- `prestarLibro(libro: Libro)`: Realiza el préstamo de un libro al lector.
- `devolverLibro(libro: Libro)`: Devuelve un libro prestado por el lector.
- `mostrarLibrosPrestados()`: Muestra los libros prestados por el lector.

### Libro

La clase `Libro` representa un libro en la biblioteca y contiene información como el nombre, el ID y la disponibilidad de copias.

#### Métodos principales

- `marcarComoPrestada(numeroCopia: int)`: Marca una copia del libro como prestada.
- `marcarComoDisponible(numeroCopia: int)`: Marca una copia del libro como disponible.
- `getCantidadCopiasDisponibles()`: Obtiene la cantidad de copias disponibles del libro.

## Ejemplo de uso

A continuación se muestra un ejemplo de cómo se puede utilizar la biblioteca:

```java
// Crear instancia de la biblioteca
Biblioteca biblioteca = new Biblioteca();

// Agregar libros
Libro libro1 = new Libro("El Aleph", 1);
Libro libro2 = new Libro("Veinte poemas de amor y una canción desesperada", 2);
Libro libro3 = new Libro("Edipo Rey", 3);
biblioteca.agregarLibro(libro1);
biblioteca.agregarLibro(libro2);
biblioteca.agregarLibro(libro3);

// Agregar lectores
Lector juan = new Lector("Juan");
Lector patricia = new Lector("Patricia");
biblioteca.agregarLector(juan);
biblioteca.agregarLector(patricia);

// Realizar préstamos y devoluciones
biblioteca.prestarLibro(juan, libro1);
biblioteca.prestarLibro(patricia, libro2);
biblioteca.prestarLibro(juan, libro3); // Este préstamo excederá el máximo de libros permitidos
biblioteca.devolverLibro(patricia, libro2);
biblioteca.prestarLibro(patricia, libro2); // Intento de préstamo de un libro sin copias disponibles

// Mostrar libros prestados por los lectores
juan.mostrarLibrosPrestados();
patricia.mostrarLibrosPrestados();
