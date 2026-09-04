package ar.edu.unlar.veterinaria.objects;

import java.util.Objects;

public class Tratamiento {

    private String nombre;
    private double costo;

    public Tratamiento(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() { return nombre; }
    public double getCosto() { return costo; }

    /**
     * Dos tratamientos son el mismo si comparten el nombre.
     *
     * Lo usan Turno.agregarTratamiento() y el contains() del modelo de la
     * lista, para impedir que un tratamiento se aplique dos veces en el
     * mismo turno.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tratamiento)) return false;
        return Objects.equals(nombre, ((Tratamiento) o).nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return nombre + " - $" + costo;
    }
}
