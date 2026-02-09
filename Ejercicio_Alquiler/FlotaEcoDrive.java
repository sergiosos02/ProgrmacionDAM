package Ejercicio_Alquiler;

import java.util.ArrayList;

public class FlotaEcoDrive {

    public static void main(String[] args) {

        ArrayList<Vehiculo> flota = new ArrayList<>();

        flota.add(new TurismoDeportivo("1234ABC", "Ferrari F8", 50));
        flota.add(new CamionCarga("5678DEF", "Volvo Truck", 120, 18));
        flota.add(new TurismoDeportivo("9101GHI", "Porsche 911", 60));

        System.out.println("=== REVISIÓN GENERAL DE LA FLOTA ===");

        for (Vehiculo v : flota) {
            v.circular(50);

            if (v instanceof Turbo) {
                ((Turbo) v).activarTurbo();
            }
        }
    }
}
