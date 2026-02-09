package Gestion_Centro_Educativo;

import java.util.ArrayList;

public class CentroEducativo {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Alumno("Laura", "111A", "1º DAM"));
        personas.add(new Alumno("Carlos", "222B", "2º DAM"));
        personas.add(new Profesor("Ana", "333C", "Programación"));
        personas.add(new Profesor("Luis", "444D", "Bases de Datos"));

        System.out.println("=== PERSONAS DEL CENTRO ===");

        for (Persona p : personas) {
            p.mostrarInformacion();

            if (p instanceof Evaluable) {
                ((Evaluable) p).evaluar();
            }

            if (p instanceof Docente) {
                ((Docente) p).impartirClase();
            }

            System.out.println();
        }
    }
}
