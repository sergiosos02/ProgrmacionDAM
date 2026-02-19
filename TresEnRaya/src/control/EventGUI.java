package control;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Coordenada;
import modelo.Tipo;
import vista.AccesoGUI;
import vista.MyButton;

public class EventGUI implements ActionListener {

    private TresEnRaya juego;
    private AccesoGUI gui;
    private boolean terminado = false;

    public EventGUI(AccesoGUI gui) {
        this.gui = gui;
        this.juego = new TresEnRaya();

        for (Component c : gui.getButtonMatrix()) {
            ((MyButton) c).addActionListener(this);
        }

        gui.getLblMensaje().setText("Turno de: " + juego.getTipoActualName());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (terminado) return;

        MyButton boton = (MyButton) e.getSource();
        Coordenada c = boton.getCoordenada();

        if (juego.realizarJugada(c)) {

            actualizarVista();

            if (juego.comprobarTresEnRaya()) {
                gui.getLblMensaje().setText("¡¡GANADOR!!");
                terminado = true;
            } else {
                gui.getLblMensaje().setText("Turno de: " + juego.getTipoActualName());
            }
        }
    }

    private void actualizarVista() {
        for (Component c : gui.getButtonMatrix()) {
            MyButton b = (MyButton) c;
            Tipo tipo = juego.getTipoEn(b.getCoordenada());
            b.setText(tipo.getNombre());
        }
    }
}
