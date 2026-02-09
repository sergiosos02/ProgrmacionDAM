package Ejercicio_Alquiler;

public class TurismoDeportivo extends Vehiculo implements Turbo {

    public TurismoDeportivo(String matricula, String modelo, double combustible) {
        super(matricula, modelo, combustible);
    }

    @Override
    public void circular(int km) {
        double consumo = km * 0.2; // doble consumo
        combustible -= consumo;
        if (combustible < 0) combustible = 0;
        System.out.println(modelo + " (Deportivo) ha circulado " + km +
                " km. Combustible restante: " + combustible);
    }

    @Override
    public void activarTurbo() {
        System.out.println(modelo + " ¡Turbo activado! 🔥");
    }
}
