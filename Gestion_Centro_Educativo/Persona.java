package Gestion_Centro_Educativo;

public abstract class Persona {

    protected String nombre;
    protected String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public abstract void mostrarInformacion();
}
