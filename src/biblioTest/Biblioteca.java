package biblioTest;

import biblioteca.Lector;
import biblioteca.Libro;
import java.util.ArrayList;

public class Biblioteca {
    private final ArrayList<Libro> libros;  //constnte tipo Objeto ArrayList de Objetos Libros de instancia
    private final ArrayList<Lector> lectores;

    public Biblioteca() {
        this.libros = new ArrayList<>();    //COMPOSICION
        this.lectores = new ArrayList<>();  //COMPOSICION
    }

    public void agregarLibro(Libro libro) {
        //las var en los parametros son loacales de los metodos
        libros.add(libro);
    }

    public void agregarLector(Lector lector) {
        lectores.add(lector);
    }

    public void prestarLibro(Lector lector, Libro libro) {
        int numeroCopiaDisponible = libro.getDisponibilidad();

        if (numeroCopiaDisponible == -1) {
            System.out.println("No hay copias disponibles de " + libro.getNombre() + " en la biblioteca.");
        } else {

            libro.marcarComoPrestada(numeroCopiaDisponible);
            lector.prestarLibro(libro);
        }
    }

    public void devolverLibro(Lector lector, Libro libro) {
        lector.devolverLibro(libro);
    }


}
