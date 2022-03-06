/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author JuanManuel
 */
public class TriangleTest {

    //Scenario 1 three values corresponding to a triangle
    @Test
    public void testIsTriangle(){
        assertTrue("We validate a triengle tha is correct", Triangle.isTriangle(3,4,5));
    }

    
    //Scenario 2 three values not corresponding to a triangle 
    @Test
    public void testIsTriangleShortestInt(){
        assertFalse("We validate a triengle tha is correct", Triangle.isTriangle(13,5,7));
    }    
/*
    //Scenario 3 test of the input from users 
    @Test
    public void test_DemoCommandLineRun(){
        ByteArrayInputStream in =
            //When the program runs, hits 5, enter (\n), 12, enter, 13, enter 
            new ByteArrayInputStream("5\n12\n13\n".getBytes());
            System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream (out));    


        String consoleOutput = "Enter Side 1: \n";
               consoleOutput = "5\n";
               consoleOutput = "Enter Side 2: \n";
               consoleOutput = "12\n";       
               consoleOutput = "Enter Side 3: \n";
               consoleOutput = "13\n";
               consoleOutput = "This a triangle: \n";       

        assertEquals(consoleOutput, out.toString());
    }
    */
    
    }
