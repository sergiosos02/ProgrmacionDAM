package MiniCalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalc extends JFrame {

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResultado;
    private JButton btnSuma;

    public MiniCalc() {
        setTitle("MiniCalc");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centrar ventana
        setLayout(null); // layout absoluto como en el dibujo

        // Etiquetas
        JLabel lblNum1 = new JLabel("primer numero");
        lblNum1.setBounds(40, 50, 100, 20);
        add(lblNum1);

        JLabel lblNum2 = new JLabel("segundo numero");
        lblNum2.setBounds(40, 100, 120, 20);
        add(lblNum2);

        JLabel lblResultado = new JLabel("resultado");
        lblResultado.setBounds(40, 170, 100, 20);
        add(lblResultado);

        // Campos de texto
        txtNum1 = new JTextField();
        txtNum1.setBounds(170, 50, 150, 25);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(170, 100, 150, 25);
        add(txtNum2);

        txtResultado = new JTextField();
        txtResultado.setBounds(170, 170, 150, 25);
        txtResultado.setEditable(false);
        add(txtResultado);

        // Botón
        btnSuma = new JButton("suma");
        btnSuma.setBounds(170, 210, 100, 30);
        add(btnSuma);

        // Acción del botón
        btnSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(txtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());
                    int suma = num1 + num2;
                    txtResultado.setText(String.valueOf(suma));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Introduce números válidos",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    public static void main(String[] args) {
        new MiniCalc().setVisible(true);
    }
}
