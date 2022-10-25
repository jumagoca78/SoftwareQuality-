// Examen Tamara Tlaiye Peredo
// 166912
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tamara extends JFrame {
private JTextField text1, text11;
private JButton boton1, boton2;
private JLabel label1, label2, label4;
int m, n, o, p;
String a="1",b="1",output;

public Tamara ()
{
super( "Examen 2" );

Container c = getContentPane();
c.setLayout( new FlowLayout() );

// construct textfield with default sizing

label1=new JLabel("Cara dado 1 ");
text1 = new JTextField( "1",2 );
c.add(label1);
c.add( text1 );

boton1 = new JButton("Tiro jugador 1");
add(boton1);



// construct textfield with default sizing
label2=new JLabel("Cara dado 2 ");
text11 = new JTextField( "1",2 );
c.add(label2);
c.add( text11 );

boton2 = new JButton("Tiro jugador 2");
add(boton2);


label4=new JLabel();
add(label4);



TextFieldHandler handler = new TextFieldHandler();
text1.addActionListener( handler );
text11.addActionListener( handler );
boton1.addActionListener( handler );
boton2.addActionListener( handler );


setSize( 300, 500 );
setVisible(true);
}

public static void main( String args[] )
{
Tamara app = new Tamara();

app.addWindowListener(
new WindowAdapter() {
public void windowClosing( WindowEvent e )
{
System.exit( 0 );
}
}
);
}

// inner class for event handling
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
output = "El ganador es el jugador 1";
}
else if (m<n){
output= "El ganador es el jugador 2";
}
else{
output="Empate";
}


label4.setText(output);

}
}
}