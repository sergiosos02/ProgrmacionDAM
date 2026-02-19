package modelo;

import java.util.Objects;

public class Coordenada {

    private int x;
    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isContigua(Coordenada otra) {
        int dx = Math.abs(this.x - otra.x);
        int dy = Math.abs(this.y - otra.y);
        return dx <= 1 && dy <= 1 && !(dx == 0 && dy == 0);
    }

    public int getX() { return x; }
    public int getY() { return y; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordenada)) return false;
        Coordenada c = (Coordenada) o;
        return x == c.x && y == c.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
