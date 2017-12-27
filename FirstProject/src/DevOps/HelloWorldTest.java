package DevOps;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import DevOps.NumberWords;

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


		

	
	@Test
	public final void TestNumToWordFive() {
	
		assertEquals("Number to Word is", "One", NumberWords.convert(1));
	}
	@Test
	public final void TestNumToWordFiveHundred() {
	
		assertEquals("Number to Word is", "Five Hundred", NumberWords.convert(500));
	}
	@Test
	public final void TestNumToWordHundred() {
	
		assertEquals("Number to Word is", "One Hundred", NumberWords.convert(100));
	}
	@Test
	public final void TestNumToWord789() {
	
		assertEquals("Number to Word is", "Seven Hundred Eighty Nine", NumberWords.convert(789));
	}
	@Test
	public final void TestNumToWord999() {
	
		assertEquals("Number to Word is", "Nine Hundred Ninety Nine", NumberWords.convert(999));
	}
	

}
