import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import java.awt.event.*;


import java.awt.*;

public class Ventana1 extends JFrame{
    private JButton boton1;
    public JLabel etiquetaMiEstado, eqtiquetaEstadoOtraVentana;
    private int miEstado = 0;


    public Ventana1(){
        super("Ventana 1");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        boton1 = new JButton("Boton 1");
        container.add(boton1);
        etiquetaMiEstado = new JLabel("Mi Estado = 0");
        container.add(etiquetaMiEstado);
        eqtiquetaEstadoOtraVentana = new JLabel("Estado otra ventana = 0");
        container.add(eqtiquetaEstadoOtraVentana);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //modficar el estado de la ventana 1
    public void setMiEstado(){
        miEstado++;
        valueChanged();
    }

    private void valueChanged() {
        etiquetaMiEstado.setText("Mi Estado = " + miEstado);
        notificaObservadores();

    }

    private void notificaObservadores() {
    }

    
 
} 


public class Handler implements AncestorListener{
    Ventana1 v1;

    public Handler(JFrame miVentana) {
        v1= (Ventana1) miVentana;
    }

    public void actionPerformed(ActionEvent e){
        //Cada que den clic modifica su estado
        v1.setMiEstado();
        
    }
}