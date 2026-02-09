package Convertidor_Euros_Pesetas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorEurosPesetas extends JFrame {

    private JTextField txtCantidad;
    private JTextField txtResultado;
    private JTextArea txtMensaje;
    private JButton btnEuros;
    private JButton btnPesetas;

    public ConversorEurosPesetas() {
        setTitle("Conversor");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // ===== Panel superior =====
        JPanel panelSuperior = new JPanel(new GridLayout(2, 2, 5, 5));
        panelSuperior.setBorder(BorderFactory.createTitledBorder(""));

        panelSuperior.add(new JLabel("Cantidad"));
        txtCantidad = new JTextField();
        panelSuperior.add(txtCantidad);

        panelSuperior.add(new JLabel("Resultado"));
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        panelSuperior.add(txtResultado);

        add(panelSuperior, BorderLayout.NORTH);

        // ===== Panel central (botones) =====
        JPanel panelCentral = new JPanel();
        btnEuros = new JButton("euros");
        btnPesetas = new JButton("Pts.");
        panelCentral.add(btnEuros);
        panelCentral.add(btnPesetas);

        add(panelCentral, BorderLayout.CENTER);

        // ===== Panel inferior (mensaje) =====
        txtMensaje = new JTextArea(4, 20);
        txtMensaje.setEditable(false);
        txtMensaje.setBorder(BorderFactory.createTitledBorder("Mensaje"));
        add(txtMensaje, BorderLayout.SOUTH);

        // ===== Eventos =====
        btnEuros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirAEuros();
            }
        });

        btnPesetas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirAPesetas();
            }
        });
    }

    private void convertirAEuros() {
        try {
            double pesetas = Double.parseDouble(txtCantidad.getText());
            double euros = pesetas / 166.386;
            txtResultado.setText(String.format("%.2f", euros));
            txtMensaje.setText("Conversión de pesetas a euros realizada correctamente.");
        } catch (NumberFormatException ex) {
            txtMensaje.setText("Error: introduce un número válido.");
        }
    }

    private void convertirAPesetas() {
        try {
            double euros = Double.parseDouble(txtCantidad.getText());
            double pesetas = euros * 166.386;
            txtResultado.setText(String.format("%.2f", pesetas));
            txtMensaje.setText("Conversión de euros a pesetas realizada correctamente.");
        } catch (NumberFormatException ex) {
            txtMensaje.setText("Error: introduce un número válido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ConversorEurosPesetas().setVisible(true);
        });
    }
}
