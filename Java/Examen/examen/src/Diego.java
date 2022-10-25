//quizz 2
//Diego Penagos Sangri
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Diego extends JFrame {
private JTextField text1, text2;
private JButton boton1, boton2;
private JLabel label1, label2, label3;
int c, d, o, p;
String a,b,salida;

public Diego ()
{
super( "Juego de dados" );

Container c = getContentPane();
c.setLayout( new FlowLayout() );


label1=new JLabel(" dado 1 ");
text1 = new JTextField( 12 );
c.add(label1);
c.add( text1 );

boton1 = new JButton("jugador 1 genera tiro");
add(boton1);



label2=new JLabel("dado 2");
text2 = new JTextField( 12 );
c.add(label2);
c.add( text2 );

boton2 = new JButton("jugador 2 genera tiro");
add(boton2);

label3=new JLabel();
add(label3);

TextFieldHandler handler = new TextFieldHandler();
text1.addActionListener( handler );
text2.addActionListener( handler );
boton1.addActionListener( handler );
boton2.addActionListener( handler );


setSize( 400, 150 );
show();
}

public static void main( String args[] )
{
Diego app = new Diego();

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
text2.setText(b);
}

c=Integer.parseInt(a);
d=Integer.parseInt(b);

if (c > d){
salida = "gana el jugador 1";
}
else{
salida= "gana el jugador 2";
}


JOptionPane.showMessageDialog( null, salida);


label3.setText(salida);

        
}
}
}