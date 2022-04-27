/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialinteractiva;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grafica extends JFrame implements ActionListener {

    Container contenedor;
    JPanel principal;
    JLabel titulo;
    JPanel botonera;
    JButton botonDocente;
    JButton botonAdmin;
    JButton botonAgregar;
    JButton botonResumen;
    JPanel panel2;
    JLabel label1;
    JTextField campo1;
    JPanel panel3;
    JLabel label2;
    JTextField campo2;
    JButton botonAgregar2;
    JPanel panel4;
    JButton atras;
    JButton resumen;
    JPanel panel5;
    private ArrayList<Empleado> lista1 = new ArrayList<>();
    private Docente d1;

    public Grafica() {
        super("ESCUELA");
        contenedor = getContentPane();
        contenedor.setLayout(null);

        //Pnael principal
        principal = new JPanel();
        principal.setLayout(null);
        principal.setBounds(0, 0, 500, 100);
        //principal.setBackground(Color.red);
        principal.setVisible(true);
        contenedor.add(principal);

        titulo = new JLabel();
        titulo.setText("Bienvenido");
        titulo.setBounds(200, 10, 100, 100);
        principal.add(titulo);

        //panel2
        botonera = new JPanel();
        botonera.setLayout(null);
        botonera.setBounds(90, 200, 300, 50);
        //botonera.setBackground(Color.blue);
        contenedor.add(botonera);
        botonera.setVisible(true);

        //Botones
        botonDocente = new JButton();
        botonDocente.addActionListener(this);
        botonDocente.setText("Docente");
        botonDocente.setBounds(10, 10, 100, 30);
        botonera.add(botonDocente);

        //boton admin
        botonAdmin = new JButton();
        botonAdmin.setBounds(175, 10, 120, 30);
        botonAdmin.addActionListener(this);
        botonAdmin.setText("Administrador");
        botonera.add(botonAdmin);

        //Menu docente
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(70, 50, 350, 350);
        //panel2.setBackground(Color.red);
        contenedor.add(panel2);

        label1 = new JLabel("asignatura");
        label1.setBounds(40, 47, 100, 23);
        panel2.add(label1);
        campo1 = new JTextField();
        campo1.setBounds(40, 70, 100, 23);
        panel2.add(campo1);

        //boton agregar
        botonAgregar = new JButton();
        botonAgregar.setBounds(150, 70, 120, 23);
        botonAgregar.addActionListener(this);
        botonAgregar.setText("Agregar");
        panel2.add(botonAgregar);
        panel2.setVisible(false);
        
        //boton agregar
        botonResumen = new JButton();
        botonResumen.setBounds(150, 70, 120, 23);
        botonResumen.addActionListener(this);
        botonResumen.setText("Resumen");
        panel2.add(botonResumen);
        panel2.setVisible(false);

        //panel admin
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(70, 50, 350, 350);
        //panel2.setBackground(Color.red);
        contenedor.add(panel3);

        label2 = new JLabel("Tecnologia");
        label2.setBounds(40, 47, 100, 23);
        panel3.add(label2);
        campo2 = new JTextField();
        campo2.setBounds(40, 70, 100, 23);
        panel3.add(campo2);

        //boton agregar
        botonAgregar2 = new JButton();
        botonAgregar2.setBounds(150, 70, 120, 23);
        botonAgregar2.addActionListener(this);
        botonAgregar2.setText("Agregar");
        panel3.add(botonAgregar2);
        panel3.setVisible(false);

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(100, 300, 300, 100);
        //panel4.setBackground(Color.red);
        contenedor.add(panel4);

        atras = new JButton();
        atras.setBounds(95, 50, 100, 30);
        atras.setText("Atras");
        atras.addActionListener(this);
        panel4.add(atras);

        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        Grafica gra = new Grafica();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonDocente) {
            principal.setVisible(false);
            botonera.setVisible(false);
            panel2.setVisible(true);
            panel3.setVisible(false);
            panel4.setVisible(true);
        }

        if (e.getSource() == botonAgregar) {   
            // Instancia e inializacion
            String nuevaAsignatura;
            nuevaAsignatura = campo1.getText();
            
            d1 = new Docente("julio", 190000, GradoAcademico.DOCTORADO.getValue(), 10, nuevaAsignatura);
            lista1.add(d1);
            System.out.println(lista1.toString());
            
            campo1.setText("");
        }
        
        if (e.getSource() == botonResumen) {               
            System.out.println(lista1.toString());
        }

        if (e.getSource() == botonAdmin) {
            principal.setVisible(false);
            botonera.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(true);
            panel4.setVisible(true);

        }

        if (e.getSource() == atras) {
            principal.setVisible(true);
            botonera.setVisible(true);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(true);

        }

        if (e.getSource() == botonAgregar2) {

        }

    }

}
