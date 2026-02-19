package vista;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import modelo.Coordenada;

public class GUI extends JFrame implements AccesoGUI {

    private JPanel contentPane;
    private JLabel lblMensaje;
    private Botonera botonera;

    public GUI() {

        setTitle("Tres en Raya");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 350);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        lblMensaje = new JLabel();
        lblMensaje.setBounds(30, 10, 300, 20);
        contentPane.add(lblMensaje);

        botonera = new Botonera(contentPane, 3);
    }

    @Override
    public Component[] getButtonMatrix() {
        return botonera.getComponents();
    }

    @Override
    public JLabel getLblMensaje() {
        return lblMensaje;
    }

    @Override
    public MyButton getButton(Coordenada coordenada) {
        return null;
    }
}
