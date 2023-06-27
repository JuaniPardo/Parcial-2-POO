package biblioteca;

public class Autor {
    private String nombre;  // var tipo opbjeto de instancia
    private String nacionalidad;
    private String fechaNacimiento;

    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Autor: " + nombre + ", Nacionalidad: " + nacionalidad + ", Fecha de nacimiento: " + fechaNacimiento;
    }
}