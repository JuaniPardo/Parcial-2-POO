package biblioteca;

public class Libro {
    private int id;     //var primitiva de instancia
    private String nombre;   //var objeto de instancia
    private String tipo;
    private String editorial;
    private int anio;
    private Autor autor;    //var tipo objeto Autor de instancia
    private int cantidadCopias;
    private int cantidadCopiasDisponibles;
    private boolean[] disponibilidad;

    public Libro(int id, String nombre, String tipo, String editorial, int anio, Autor autor, int cantidadCopias) {
        //los parametros son var locales del metodo constructor
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anio = anio;
        this.autor = autor;
        this.cantidadCopias = cantidadCopias;
        this.cantidadCopiasDisponibles = cantidadCopias;
        this.disponibilidad = new boolean[cantidadCopias];

        for (int i = 0; i < cantidadCopias; i++) {
            disponibilidad[i] = true;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public int getCantidadCopiasDisponibles() {
        return cantidadCopiasDisponibles;
    }

    public int getDisponibilidad() {
        for (int i = 0; i < disponibilidad.length; i++) {
            if (disponibilidad[i]) {
                return i;
            }
        }

        return -1;
    }

    public int obtenerCopiaPrestada() {

        for (int i = 0; i < disponibilidad.length; i++) {
            if (!disponibilidad[i]) {
                return i;
            }
        }

        return -1;
    }

    public void marcarComoPrestada(int numeroCopia) {
        disponibilidad[numeroCopia] = false;
        cantidadCopiasDisponibles--;
    }

    public void marcarComoDisponible(int numeroCopia) {
        disponibilidad[numeroCopia] = true;
        cantidadCopiasDisponibles++;
    }

    @Override
    public String toString() {
        return "Libro: " + nombre +
                "\n\tTipo: " + tipo +
                "\n\tEditorial: " + editorial +
                "\n\tAño: " + anio +
                "\n\tAutor: " + autor +
                "\n\tCantidad de Copias: " + cantidadCopias +
                "\n\tCantidad Disponible: " + cantidadCopiasDisponibles;
    }
}
