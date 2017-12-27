
/**-
 * 
 */
package oata;

import static org.junit.Assert.*;
//
import org.junit.Test;

//import static org.junit.Assert.assertEquals;


/**
 * @author cmanisha
 *
 */
public class HelloWorldTest {

	/**
	 * Test method for {@link oata.HelloWorld#HelloWorld()}.
	 */
	@Test
	public void testHelloWorld() {
		fail("Not yet implemented message");
	}
	@Test
	public void testHelloWorld1() {
		assertEquals("Pass test","1","1");
	}
	@Test
	public final void testMinFunction() {
		
		assertEquals("This isworking", 6, HelloWorld.minFunction(11,6));
	
		
	}
	@Test
	public final void testMinFunction1() {
		
		assertEquals("This isw not orking", 2, HelloWorld.minFunction(11,6));
	
		
	}
}
