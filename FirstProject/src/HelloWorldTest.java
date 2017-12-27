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
	

	
	@Test
	public final void TestNumToWordFive() {
	
		assertEquals("Number to Word is", "Five", HelloWorld.convert(5));
	}
	@Test
	public final void TestNumToWordFiveHundred() {
	
		assertEquals("Number to Word is", "Five Hundred", HelloWorld.convert(500));
	}
	@Test
	public final void TestNumToWordHundred() {
	
		assertEquals("Number to Word is", "One Hundred", HelloWorld.convert(100));
	}

}
