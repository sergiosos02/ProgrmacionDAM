package control;

import java.awt.EventQueue;
import vista.GUI;

public class Principal {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            GUI frame = new GUI();
            new EventGUI(frame);
            frame.setVisible(true);
        });
    }
}
