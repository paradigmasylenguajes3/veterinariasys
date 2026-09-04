package ar.edu.unlar.veterinaria.objects;

public class Mascota {

    private String nombre;
    private Especie especie;
    private int edad;
    private Cliente duenio;

    public Mascota(String nombre, Especie especie, int edad, Cliente duenio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.duenio = duenio;
    }

    public String getNombre() { return nombre; }
    public Especie getEspecie() { return especie; }
    public int getEdad() { return edad; }
    public Cliente getDuenio() { return duenio; }

    @Override
    public String toString() {
        return nombre + " (" + especie + ") - " + duenio.nombreCompleto();
    }
}
