package vista;

import java.awt.Component;
import javax.swing.JLabel;
import modelo.Coordenada;

public interface AccesoGUI {

    Component[] getButtonMatrix();
    JLabel getLblMensaje();
    MyButton getButton(Coordenada coordenada);
}
