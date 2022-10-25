//Carlos Carcaño Berman 171779
//Quiz 2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarlosCarca extends JFrame {
private JTextField text1, text11;
private JButton boton1, boton2;
private JLabel label1, label2, label3;
int m, n, o, p;
String a,b,salida;

public CarlosCarca ()
{
super( "Juego del Dado" );

Container c = getContentPane();
c.setLayout( new FlowLayout() );


label1=new JLabel("Cara dado 1 ");
text1 = new JTextField( 5 );
c.add(label1);
c.add( text1 );

boton1 = new JButton("Tiro del jugador 1");
add(boton1);


label2=new JLabel("Cara dado 2 ");
text11 = new JTextField( 5 );
c.add(label2);
c.add( text11 );

boton2 = new JButton("Tiro del jugador 2");
add(boton2);


label3=new JLabel();
add(label3);



TextFieldHandler handler = new TextFieldHandler();
text1.addActionListener( handler );
text11.addActionListener( handler );
boton1.addActionListener( handler );
boton2.addActionListener( handler );


setSize( 400, 500 );
show();
}

public static void main( String args[] )
{
    CarlosCarca app = new CarlosCarca();

app.addWindowListener(
new WindowAdapter() {
public void windowClosing( WindowEvent e )
{
System.exit( 0 );
}
}
);
}


private class TextFieldHandler implements ActionListener {
public void actionPerformed(ActionEvent e)
{

if(e.getSource() == boton1 ){

o=1+(int) (Math.random()*5);
a=Integer.toString(o);
text1.setText(a);
}

if(e.getSource() == boton2 ){

p=1+(int) (Math.random()*5);
b=Integer.toString(p);
text11.setText(b);
}

m=Integer.parseInt(a);
n=Integer.parseInt(b);

if (m > n){
salida = "Ganador, jugador 1";
}
else if (m<n){
salida= "Ganador, jugador 2";
}
else{
salida=" Empataron";
}


label3.setText(salida);

}
}
}