package ar.edu.unlar.veterinaria.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Turno de atencion. Un turno atiende a una mascota, esta a cargo de un
 * veterinario y se le aplican uno o mas tratamientos.
 *
 * NO MODIFICAR: forma parte del dominio entregado.
 */
public class Turno {

    private String fecha;
    private String hora;
    private String motivo;
    private Mascota mascota;
    private Veterinario veterinario;
    private EstadoTurno estado;
    private final List<Tratamiento> tratamientos = new ArrayList<>();

    public Turno(String fecha, String hora, String motivo,
                 Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.estado = EstadoTurno.PENDIENTE;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getMotivo() { return motivo; }
    public Mascota getMascota() { return mascota; }
    public Veterinario getVeterinario() { return veterinario; }
    public EstadoTurno getEstado() { return estado; }
    public void setEstado(EstadoTurno estado) { this.estado = estado; }

    /**
     * Agrega un tratamiento si no es nulo y no estaba aplicado.
     * @return true si el tratamiento fue efectivamente agregado.
     */
    public boolean agregarTratamiento(Tratamiento tratamiento) {
        if (tratamiento == null || tratamientos.contains(tratamiento)) {
            return false;
        }
        return tratamientos.add(tratamiento);
    }

    public boolean quitarTratamiento(Tratamiento tratamiento) {
        return tratamientos.remove(tratamiento);
    }

    /** Lista de solo lectura: para modificarla hay que usar agregar/quitar. */
    public List<Tratamiento> getTratamientos() {
        return Collections.unmodifiableList(tratamientos);
    }

    public int cantidadTratamientos() {
        return tratamientos.size();
    }

    /** Suma del costo de todos los tratamientos aplicados en el turno. */
    public double costoTotal() {
        return tratamientos.stream()
                .mapToDouble(Tratamiento::getCosto)
                .sum();
    }

    @Override
    public String toString() {
        return fecha + " " + hora
                + " | " + mascota.getNombre()
                + " | " + veterinario.nombreCompleto()
                + " | " + tratamientos.stream()
                                      .map(Tratamiento::getNombre)
                                      .collect(Collectors.joining(", "))
                + " | $" + costoTotal();
    }
}
