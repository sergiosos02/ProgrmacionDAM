package Gestor_De_Tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GestorTareas extends JFrame {

    private DefaultListModel<String> modeloLista;
    private JList<String> listaTareas;
    private JTextField campoTarea;

    public GestorTareas() {
        setTitle("Gestor de Tareas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        add(panel);

        // Campo de texto
        campoTarea = new JTextField();
        panel.add(campoTarea, BorderLayout.NORTH);

        // Lista de tareas
        modeloLista = new DefaultListModel<>();
        listaTareas = new JList<>(modeloLista);
        panel.add(new JScrollPane(listaTareas), BorderLayout.CENTER);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnGuardar = new JButton("Guardar en TXT");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnGuardar);
        panel.add(panelBotones, BorderLayout.SOUTH);

        // Eventos
        btnAgregar.addActionListener(e -> agregarTarea());
        btnEliminar.addActionListener(e -> eliminarTarea());
        btnGuardar.addActionListener(e -> guardarEnTXT());
    }

    private void agregarTarea() {
        String tarea = campoTarea.getText().trim();
        if (!tarea.isEmpty()) {
            modeloLista.addElement(tarea);
            campoTarea.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Escribe una tarea primero");
        }
    }

    private void eliminarTarea() {
        int indice = listaTareas.getSelectedIndex();
        if (indice != -1) {
            modeloLista.remove(indice);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una tarea");
        }
    }

    private void guardarEnTXT() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("tareas.txt"))) {

            for (int i = 0; i < modeloLista.size(); i++) {
                bw.write(modeloLista.getElementAt(i));
                bw.newLine();
            }

            JOptionPane.showMessageDialog(this, "Tareas guardadas en tareas.txt");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestorTareas().setVisible(true);
        });
    }
}
