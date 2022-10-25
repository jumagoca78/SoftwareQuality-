import java.util.Scanner;
class Main {
public static void main(String[] args) {

//Declarar variables
int [] N= new int [16];
int[] Valorenlaserie = new int [16];

//scanner
Scanner lecture = new Scanner (System.in);

//Declarar variable de control e inicializar
int variableControl = 0;

//Print table
System.out.println("N \t Valorenlaserie");

for (int i =0; i<=N.length-1; i++)
{
int value1 = i;
N[i] = value1;
}
Valorenlaserie[0]=0;
for (int i =0; i<=Valorenlaserie.length-1; i++)
{
int value = i+(i+1);
Valorenlaserie[i] = value;
}
for (int i= 0; i< Valorenlaserie.length; i++)
{
//System.out.println(Valorenlaserie[i]);
System.out.println (N[i] + "\t" + Valorenlaserie[i]);
}
//input
int num1;
System.out.println("Ingresar el número de la serie que quieres consultar");
num1 = lecture.nextInt();


System.out.println(Valorenlaserie[num1]);

int condition;
System.out.println("Quiere volver a intentarlo \n 1-si \n 2-no");
condition = lecture.nextInt();


}

}