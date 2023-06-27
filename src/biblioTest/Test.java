package biblioTest;

import biblioteca.Autor;
import biblioteca.Lector;
import biblioteca.Libro;

public class Test {
    public static void main(String[] args) {
        // Creación de libros
        Autor borges = new Autor("Jorge Luis Borges", "Argentina", "24 de agosto de 1899");
        Autor neruda = new Autor("Pablo Neruda", "Chile", "12 de julio de 1904");
        Autor sofocles = new Autor("Sófocles", "Grecia", "496 a.C.");

        Libro libro1 = new Libro(1, "Ficciones", "Novela", "Editorial A", 2020, borges, 3);
        Libro libro2 = new Libro(2, "Veinte poemas...", "Poesía", "Editorial B", 2021, neruda, 2);
        Libro libro3 = new Libro(3, "Edipo Rey", "Teatro", "Editorial C", 2022, sofocles, 1);

        // Creación de lectores
        Lector juan = new Lector("Juan");
        Lector patricia = new Lector("Patricia");

        // Agregar libros a la biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Agregar lectores a la biblioteca
        biblioteca.agregarLector(juan);
        biblioteca.agregarLector(patricia);

        // Prestamos y devoluciones de libros
        System.out.println("Acciones a ejecutar:\n");

        System.out.println("--- Prestamos y devoluciones ---\n");

        System.out.println("Prestamo: libro1 a juan");
        biblioteca.prestarLibro(juan, libro1);
        System.out.println();

        System.out.println("Prestamo: libro2 a patricia");
        biblioteca.prestarLibro(patricia, libro2);
        System.out.println();

        System.out.println("Prestamo: libro3 a juan");
        biblioteca.prestarLibro(juan, libro3);
        System.out.println();

        System.out.println("Intento de prestamo: libro3 a patricia (no hay copias disponibles)");
        biblioteca.prestarLibro(patricia, libro3);
        System.out.println();

        System.out.println("Devolucion: libro1 por juan");
        biblioteca.devolverLibro(juan, libro1);
        System.out.println();

        System.out.println("Devolucion: libro2 por patricia");
        biblioteca.devolverLibro(patricia, libro2);
        System.out.println();

        System.out.println("Prestamo: libro1 a juan");
        biblioteca.prestarLibro(juan, libro1);
        System.out.println();

        System.out.println("Prestamo: libro1 a juan");
        biblioteca.prestarLibro(juan, libro1);
        System.out.println();

        System.out.println("Intento de prestamo: libro1 a juan (ya tiene el máximo de libros prestados)");
        biblioteca.prestarLibro(juan, libro1);
        System.out.println();

        // Mostrar libros prestados
        System.out.println("--- Libros prestados ---\n");

        juan.mostrarLibrosPrestados();
        System.out.println();

        patricia.mostrarLibrosPrestados();
        System.out.println();

        // Mostrar información de los libros
        System.out.println("--- Información de los libros ---\n");

        System.out.println(libro1);
        System.out.println();

        System.out.println(libro2);
        System.out.println();

        System.out.println(libro3);
    }
}
