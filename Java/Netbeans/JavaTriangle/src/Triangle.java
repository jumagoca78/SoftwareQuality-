/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanManuel
 */
public class Triangle {
    
    public String checkTriangle(int a, int b, int c){
        
        return "El triangulo es: ";
    }

    //check if the numbers correnponds to a triangle
    public static boolean isTriangle (int a, int b, int c){
        //Rule for a triangle, no side is larger than de sum of the two other sides    
        if ( (a+b>c) &&
             (a+c>b) &&
             (b+c>a)   )
             {
                 return true;

             }
        return false;
    }
    
}
