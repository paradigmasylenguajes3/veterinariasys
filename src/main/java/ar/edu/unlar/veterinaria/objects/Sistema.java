package ar.edu.unlar.veterinaria.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Almacen en memoria de la aplicacion. Unica instancia accesible desde
 * cualquier formulario mediante Sistema.getInstancia().
 *
 * NO MODIFICAR: forma parte del dominio entregado.
 */
public class Sistema {

    private static Sistema instancia;

    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Veterinario> veterinarios = new ArrayList<>();
    private final List<Mascota> mascotas = new ArrayList<>();
    private final List<Tratamiento> tratamientos = new ArrayList<>();
    private final List<Turno> turnos = new ArrayList<>();

    private Sistema() {
        cargarDatosDePrueba();
    }

    public static Sistema getInstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }

    // --- Turnos ---
    public void agregarTurno(Turno turno) { turnos.add(turno); }
    public void quitarTurno(Turno turno) { turnos.remove(turno); }
    public List<Turno> getTurnos() { return Collections.unmodifiableList(turnos); }

    // --- Catalogos (solo lectura para este parcial) ---
    public List<Cliente> getClientes() { return Collections.unmodifiableList(clientes); }
    public List<Veterinario> getVeterinarios() { return Collections.unmodifiableList(veterinarios); }
    public List<Mascota> getMascotas() { return Collections.unmodifiableList(mascotas); }
    public List<Tratamiento> getTratamientos() { return Collections.unmodifiableList(tratamientos); }

    /**
     * PUNTO 1 - Carga inicial de datos.
     *
     * Se deja UN ejemplo de cada tipo como modelo a seguir. Complete el metodo
     * agregando, como minimo:
     *   - 2 clientes mas
     *   - 3 mascotas mas (repartidas entre los clientes)
     *   - 2 veterinarios mas
     *   - 5 tratamientos mas, con costos distintos
     *
     * Preste atencion a que cada mascota debe quedar asociada a su duenio en
     * las dos direcciones: en la lista de mascotas del cliente y en la lista
     * general del sistema.
     */
    private void cargarDatosDePrueba() {

        Cliente c1 = new Cliente("C-001", "30111222", "Laura", "Gimenez", "380-4111111");
        clientes.add(c1);

        Mascota m1 = new Mascota("Rocco", Especie.PERRO, 4, c1);
        c1.agregarMascota(m1);
        mascotas.add(m1);

        veterinarios.add(new Veterinario("MP-1204", "Clinica general",
                "27333444", "Ana", "Robles", "380-4444444"));

        tratamientos.add(new Tratamiento("Consulta general", 8000));

        // TODO PUNTO 1: complete la carga siguiendo los ejemplos de arriba.

    }
}
