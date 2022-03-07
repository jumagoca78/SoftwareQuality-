import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream; 
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class TestCircle {
    
    @Test
    public void test(){
        String input ="1\n";

        ByteArrayInputStream in =
                new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
       
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut (new PrintStream (out));

        String [] args = {};
        DemoCircle.main (args);

        String consoleOutput  = "Enter the radius: "                        + 
                                System.getProperty("line.separator")        +
                                "For a circle with radius 1.0,"             + 
                                System.getProperty("line.separator")        +
                                " the circumference is 6.283185307179586"   + 
                                System.getProperty("line.separator")        +
                                " and the area is 3.141592653589793."       + 
                                System.getProperty("line.separator");  
        
        assertEquals (consoleOutput, out.toString());
               

    }
    
}