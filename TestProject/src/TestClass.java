/**
 * 
 */

/**
 * @author cmanisha
 *
 */
public class TestClass {

	/**
	 * 
	 */
	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int a = 11;
	      int b = 6;
	      int c = minFunction(a, b);
	      System.out.println("Minimum Value = " + c);
	 }     
 
	 /** returns the minimum of two numbers */
	  public static int minFunction(int n1, int n2) 
	  {
	      int min;
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min; 
	   }
	}
