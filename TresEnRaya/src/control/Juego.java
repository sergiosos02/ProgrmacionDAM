package control;

import modelo.Tipo;

public class Juego {

    private int numeroJugada = 1;

    public Tipo getTurnoActual() {
        return (numeroJugada % 2 == 0) ? Tipo.O : Tipo.X;
    }

    public String getTurnoActualName() {
        return getTurnoActual().getNombre();
    }

    public void incrementarJugada() {
        numeroJugada++;
    }

    public int getNumeroJugada() {
        return numeroJugada;
    }

    public boolean faseColocacion() {
        return numeroJugada <= 6;
    }
}
