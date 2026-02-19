package control;

import modelo.Coordenada;
import modelo.Tablero;
import modelo.Tipo;

public class TresEnRaya {

    private Tablero tablero;
    private Juego juego;

    private Coordenada origen = null;
    private boolean esperandoOrigen = true;

    public TresEnRaya() {
        tablero = new Tablero();
        juego = new Juego();
    }

    public boolean realizarJugada(Coordenada c) {

        // Fase 1: Colocación
        if (juego.faseColocacion()) {
            boolean ok = tablero.colocarFicha(c, juego.getTurnoActual());
            if (ok) juego.incrementarJugada();
            return ok;
        }

        // Fase 2: Movimiento
        if (esperandoOrigen) {

            if (tablero.isPropiedad(c, juego.getTurnoActual())
                    && !tablero.isBloqueada(c)) {

                origen = c;
                esperandoOrigen = false;
                return true;
            }
            return false;
        } else {

            if (tablero.isLibre(c) && origen.isContigua(c)) {

                tablero.borrarFicha(origen);
                tablero.colocarFicha(c, juego.getTurnoActual());

                juego.incrementarJugada();
                esperandoOrigen = true;
                return true;
            }
            return false;
        }
    }

    public boolean comprobarTresEnRaya() {
        return tablero.isTresEnRaya();
    }

    public String getTipoActualName() {
        return juego.getTurnoActualName();
    }

    public int getNumerojugada() {
        return juego.getNumeroJugada();
    }

    public Tipo getTipoEn(Coordenada c) {
        return tablero.getPosicion(c);
    }
}
