package Gestion_Centro_Educativo;

public class Alumno extends Persona implements Evaluable {

    private String curso;

    public Alumno(String nombre, String dni, String curso) {
        super(nombre, dni);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Alumno: " + nombre + 
                           " | DNI: " + dni + 
                           " | Curso: " + curso);
    }

    @Override
    public void evaluar() {
        System.out.println(nombre + " está siendo evaluado.");
    }
}
