package Coches_App;

public class RuedaRespuesta extends Rueda {
    private int kilometrajeMaximo;
    private int kilometrosRealizados;

    public RuedaRespuesta(int kilometrajeMaximo) {
        this.kilometrajeMaximo = kilometrajeMaximo;
        this.kilometrosRealizados = 0;
    }

    public void recorrerKilometros(int km) {
        kilometrosRealizados += km;
    }

    public boolean estaAgotada() {
        return kilometrosRealizados >= kilometrajeMaximo;
    }
}
