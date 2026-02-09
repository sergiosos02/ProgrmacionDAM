package Gestion_Contactos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AgendaContactos extends JFrame {

    private JTextField txtNombre, txtTelefono;
    private DefaultTableModel modelo;
    private JTable tabla;

    public AgendaContactos() {
        setTitle("Agenda de Contactos");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel superior
        JPanel panelSuperior = new JPanel(new GridLayout(2, 2, 5, 5));
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Nuevo contacto"));

        txtNombre = new JTextField();
        txtTelefono = new JTextField();

        panelSuperior.add(new JLabel("Nombre:"));
        panelSuperior.add(txtNombre);
        panelSuperior.add(new JLabel("Teléfono:"));
        panelSuperior.add(txtTelefono);

        // Tabla
        modelo = new DefaultTableModel(new String[]{"Nombre", "Teléfono"}, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);

        // Botones
        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnGuardar = new JButton("Guardar en TXT");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnGuardar);

        add(panelSuperior, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Eventos
        btnAgregar.addActionListener(e -> agregarContacto());
        btnEliminar.addActionListener(e -> eliminarContacto());
        btnGuardar.addActionListener(e -> guardarEnTXT());
    }

    private void agregarContacto() {
        String nombre = txtNombre.getText().trim();
        String telefono = txtTelefono.getText().trim();

        if (nombre.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Rellena todos los campos");
            return;
        }

        modelo.addRow(new Object[]{nombre, telefono});
        txtNombre.setText("");
        txtTelefono.setText("");
    }

    private void eliminarContacto() {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un contacto");
        }
    }

    private void guardarEnTXT() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("contactos.txt"))) {

            for (int i = 0; i < modelo.getRowCount(); i++) {
                String nombre = modelo.getValueAt(i, 0).toString();
                String telefono = modelo.getValueAt(i, 1).toString();
                bw.write(nombre + " - " + telefono);
                bw.newLine();
            }

            JOptionPane.showMessageDialog(this, "Contactos guardados en contactos.txt");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AgendaContactos().setVisible(true);
        });
    }
}
