package cn.itcast_04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *     Class Throwable
 *	String	getMessage()
			Returns the detail message string of this throwable.
			
	String	toString()
			Returns a short description of this throwable.	
			
	void	printStackTrace()
			Prints this throwable and its backtrace to the standard error stream.	
		
 */

/**
 *   	Class  SimpleDateFormat
 *	  SimpleDateFormat(String pattern)
	  Constructs a SimpleDateFormat using the given pattern and the default date format symbols for the default FORMAT locale.
 
 	Date parse(String text, ParsePosition pos)
 	     Parses text from a string to produce a Date.
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		String s = "2017-10-27";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date d = sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("over");
		
		
	}

}
