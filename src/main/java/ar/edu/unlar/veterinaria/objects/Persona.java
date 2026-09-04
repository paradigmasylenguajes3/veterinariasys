package ar.edu.unlar.veterinaria.objects;

/**
 * Clase base de todas las personas del sistema.
 * NO MODIFICAR: forma parte del dominio entregado.
 */
public abstract class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    protected Persona(String dni, String nombre, String apellido, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTelefono() { return telefono; }

    public String nombreCompleto() {
        return apellido + ", " + nombre;
    }
}
