package vista;

import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;
import modelo.Coordenada;

public class Botonera extends JPanel {

    private MyButton[][] botones;

    public Botonera(JPanel contentPane, int dimension) {

        botones = new MyButton[dimension][dimension];

        setBounds(80, 50, 240, 240);
        setLayout(new GridLayout(dimension, dimension));
        contentPane.add(this);

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                botones[i][j] = new MyButton(new Coordenada(i, j));
                add(botones[i][j]);
            }
        }
    }

    public Component[] getComponents() {
        return super.getComponents();
    }
}
