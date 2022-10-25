import java.util.Scanner;

public class DemoCircle {
    
    public static void main (String [] args ){

    double r, area, circum;
    Scanner reader = new Scanner (System.in);

    //User Input
    System.out.println("Enter the radius: ");
    r = reader.nextDouble();

    circum  = Circle.circum (r);
    area    = Circle.area (r);
    
    System.out.println("For a circle with radius "  + r   +",");
    System.out.println(" the circumference is "     + circum);
    System.out.println(" and the area is "          + area+ ".");
                            
    reader.close();

    }
}
