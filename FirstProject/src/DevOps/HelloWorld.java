package DevOps;
import java.text.NumberFormat;

import  DevOps.NumberWords;
//import NumberWordsApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author MPARMAR
 *
 */
public final class HelloWorld {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	/**
	 * 
	 */
	public HelloWorld() {	// TODO Auto-generated constructor stub	
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	public static String toWords1( int number ) {
		String result = "Not Implemented" ;
		return result.trim() ;
	}
	public void execute() {
		while( true ) {
			try {
				System.out.print( "Enter number (0 to exit): " ) ;
				String value = reader.readLine() ;
				if (value=="0") { break;}
				else
				{
				int number = Integer.parseInt( value ) ;
				System.out.println( NumberWords.convert(number) ) ;
				}
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "Invalid number" ) ;
			}
		}
	}
	
	
		
	
		public static void main(String[] args) 
		{
			new HelloWorld().execute() ;
		      //int a = 11;
		      
	//	      String NumWord=toWords1(a);
		//      System.out.println("Number "+ a + " to Work is  " + NumWord);
		  //    int n;

			//	n = -15;
				//System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");
		      
		 }     
	 
		 
	     
	}
