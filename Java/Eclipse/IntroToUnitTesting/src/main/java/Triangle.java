
public class Triangle {

			
	
	public static boolean isTriangle(double a, double b, double c) {
		if ((a + b > c) &&
		    (a + c > b) && // should be a + c > b
	        (b + c > a)) {
	            return true; 
	        }
	        return false;
	    }
	
	
}
