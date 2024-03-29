import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class Ventana1 extends JFrame{
    private JButton boton1;
    private ArrayList <JFrame> observers;
    public JLabel etiquetaMiEstado, eqtiquetaEstadoOtraVentana;
    private int miEstado = 0;


    public Ventana1(Ventana2 ventana){
        super("Ventana 1");

        observers = new ArrayList<Ventana2>();
        observers.add(ventana);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        Handler1 handler1 = new Handler1(this); 

        boton1 = new JButton("Boton 1");
        boton1.addActionListener(handler1);
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
        update();
        notificaObservadores();

    }

    private void update (){
        etiquetaMiEstado.setText("Mi Estado = " + miEstado);
    }


    private void notificaObservadores() {
        for (JFrame observer : observers) {
            observer.update(miEstado);
        }
    }

    
 
} 


public class Handler1 implements AncestorListener{
    Ventana1 v1;

    public Handler1(Ventana1 miVentana) {
        v1= (Ventana1) miVentana;
    }

    public void actionPerformed(ActionEvent e){
        //Cada que den clic modifica su estado
        v1.setMiEstado();
        
    }

 
}