package biblioteca;
import java.util.ArrayList;

public class Lector {
    private String nombre;
    private ArrayList<Libro> librosPrestados;

    public Lector(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }


    public void prestarLibro(Libro libro) {
        if (librosPrestados.size() >= 3) {
            System.out.println(this.nombre + " ya tiene el máximo de libros prestados. No puede tomar prestado más libros.");
        } else {
            librosPrestados.add(libro);
            System.out.println("Se prestó el libro '" + libro.getNombre() + "' a " + nombre +
                        "\n\tQuedan " + libro.getCantidadCopiasDisponibles() + " copias");
        }

    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            int numeroCopia = libro.obtenerCopiaPrestada(); // El número de copia es igual al ID - 1
            libro.marcarComoDisponible(numeroCopia);
            System.out.println(nombre + " devolvió el libro '" + libro.getNombre() +
                    "\n\tQuedan " + libro.getCantidadCopiasDisponibles() + " copias");
        } else {
            System.out.println("No puedes devolver un libro que no tienes prestado.");
        }
    }

    public void mostrarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println(nombre + " no tiene libros prestados.");
        } else {
            System.out.println("Libros prestados a " + nombre + ":");
            for (Libro libro : librosPrestados) {
                System.out.println(libro.toString());
            }
        }
    }


}