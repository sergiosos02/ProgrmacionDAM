package vista;

import javax.swing.JButton;
import modelo.Coordenada;

public class MyButton extends JButton {

    private Coordenada coordenada;

    public MyButton(Coordenada coordenada) {
        this.coordenada = coordenada;
        setFocusPainted(false);
        setFont(getFont().deriveFont(24f));
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }
}
