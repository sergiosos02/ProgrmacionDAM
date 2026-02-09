package Gestion_Centro_Educativo;

public class Profesor extends Persona implements Docente {

    private String especialidad;

    public Profesor(String nombre, String dni, String especialidad) {
        super(nombre, dni);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombre + 
                           " | DNI: " + dni + 
                           " | Especialidad: " + especialidad);
    }

    @Override
    public void impartirClase() {
        System.out.println(nombre + " imparte clase de " + especialidad);
    }
}

