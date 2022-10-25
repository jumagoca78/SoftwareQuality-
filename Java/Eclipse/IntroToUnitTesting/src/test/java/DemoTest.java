/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 * 
 * 
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {
	
	//first we test a triangle that is a triangle
	@Test
	public void orderTest () {
		assertTrue (Demo.isTriangle(2, 1, 4));	
	}

}
