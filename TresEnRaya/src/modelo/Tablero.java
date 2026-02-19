package modelo;

public class Tablero {

    private final int DIM = 3;
    private Tipo[][] matriz;

    public Tablero() {
        matriz = new Tipo[DIM][DIM];
        inicializar();
    }

    private void inicializar() {
        for (int i = 0; i < DIM; i++)
            for (int j = 0; j < DIM; j++)
                matriz[i][j] = Tipo.BLANCO;
    }

    public boolean colocarFicha(Coordenada c, Tipo tipo) {
        if (isLibre(c)) {
            matriz[c.getX()][c.getY()] = tipo;
            return true;
        }
        return false;
    }

    public void borrarFicha(Coordenada c) {
        matriz[c.getX()][c.getY()] = Tipo.BLANCO;
    }

    public boolean isLibre(Coordenada c) {
        return matriz[c.getX()][c.getY()] == Tipo.BLANCO;
    }

    public boolean isPropiedad(Coordenada c, Tipo tipo) {
        return matriz[c.getX()][c.getY()] == tipo;
    }

    public boolean isBloqueada(Coordenada c) {
        for (int i = c.getX() - 1; i <= c.getX() + 1; i++) {
            for (int j = c.getY() - 1; j <= c.getY() + 1; j++) {
                if (i >= 0 && i < DIM && j >= 0 && j < DIM) {
                    if (matriz[i][j] == Tipo.BLANCO)
                        return false;
                }
            }
        }
        return true;
    }

    public Tipo getPosicion(Coordenada c) {
        return matriz[c.getX()][c.getY()];
    }

    public boolean isTresEnRaya() {

        // Filas
        for (int i = 0; i < DIM; i++)
            if (matriz[i][0] != Tipo.BLANCO &&
                matriz[i][0] == matriz[i][1] &&
                matriz[i][1] == matriz[i][2])
                return true;

        // Columnas
        for (int j = 0; j < DIM; j++)
            if (matriz[0][j] != Tipo.BLANCO &&
                matriz[0][j] == matriz[1][j] &&
                matriz[1][j] == matriz[2][j])
                return true;

        // Diagonales
        if (matriz[0][0] != Tipo.BLANCO &&
            matriz[0][0] == matriz[1][1] &&
            matriz[1][1] == matriz[2][2])
            return true;

        if (matriz[0][2] != Tipo.BLANCO &&
            matriz[0][2] == matriz[1][1] &&
            matriz[1][1] == matriz[2][0])
            return true;

        return false;
    }
}
