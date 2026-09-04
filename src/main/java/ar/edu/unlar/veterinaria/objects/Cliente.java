package ar.edu.unlar.veterinaria.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente extends Persona {

    private String nroCliente;
    private final List<Mascota> mascotas = new ArrayList<>();

    public Cliente(String nroCliente, String dni, String nombre, String apellido, String telefono) {
        super(dni, nombre, apellido, telefono);
        this.nroCliente = nroCliente;
    }

    public String getNroCliente() { return nroCliente; }

    public boolean agregarMascota(Mascota mascota) {
        if (mascota == null || mascotas.contains(mascota)) {
            return false;
        }
        return mascotas.add(mascota);
    }

    public List<Mascota> getMascotas() {
        return Collections.unmodifiableList(mascotas);
    }

    @Override
    public String toString() {
        return nombreCompleto();
    }
}
