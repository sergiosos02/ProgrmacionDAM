package Coches_App;

public class Coche {
	
    private Motor motor;
    private Rueda[] ruedas;
    private Puerta[] puertas;

    public Coche() {
        motor = new Motor();

        ruedas = new Rueda[4];
        for (int i = 0; i < 4; i++) {
            ruedas[i] = new Rueda();
        }

        puertas = new Puerta[2];
        for (int i = 0; i < 2; i++) {
            puertas[i] = new Puerta();
        }
    }

    public void arrancarCoche() {
        motor.arrancar();
    }

    public void apagarCoche() {
        motor.apagar();
    }
}
