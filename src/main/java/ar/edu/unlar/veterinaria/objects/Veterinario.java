package ar.edu.unlar.veterinaria.objects;

public class Veterinario extends Persona {

    private String matricula;
    private String especialidad;

    public Veterinario(String matricula, String especialidad,
                       String dni, String nombre, String apellido, String telefono) {
        super(dni, nombre, apellido, telefono);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public String getMatricula() { return matricula; }
    public String getEspecialidad() { return especialidad; }

    @Override
    public String toString() {
        return nombreCompleto() + " (" + especialidad + ")";
    }
}
