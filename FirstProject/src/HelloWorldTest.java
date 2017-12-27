import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 * 
 */

/**
 * @author MPARMAR
 *
 */
public class HelloWorldTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}


	/**
	 * Test method for {@link HelloWorld#main(java.lang.String[])}.
	 */
	

	/**
	// * Test method for {@link HelloWorld#minFunction()}.
	 */
	@Test
	public final void testMinFunction() {
		
		assertEquals("This isworking", 6, HelloWorld.minFunction(11,6));
	
		
	}
	@Test
	public final void testMinFunction1() {
		
		assertEquals("This isw not orking", 2, HelloWorld.minFunction(11,6));
	
		
	}

}
