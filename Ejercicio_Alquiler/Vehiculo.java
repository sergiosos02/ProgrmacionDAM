package Ejercicio_Alquiler;

public abstract class Vehiculo {

    protected String matricula;
    protected String modelo;
    protected double combustible;

    public Vehiculo(String matricula, String modelo, double combustible) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.combustible = combustible;
    }

    public void circular(int km) {
        double consumo = km * 0.1;
        combustible -= consumo;
        if (combustible < 0) combustible = 0;
        System.out.println(modelo + " ha circulado " + km + " km. Combustible restante: " + combustible);
    }
}
