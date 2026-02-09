package Ejercicio_Alquiler;

public class CamionCarga extends Vehiculo {

    private double capacidadCarga;

    public CamionCarga(String matricula, String modelo, double combustible, double capacidadCarga) {
        super(matricula, modelo, combustible);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void circular(int km) {
        System.out.println("⚠ Vehículo pesado en movimiento");
        super.circular(km);
    }
}
