package cn.itcast_03;
/**
 * 					Class Integer
 * 
 * 		
 * 		 Field:
		static int	MAX_VALUE
					A constant holding the maximum value an int can have, 231-1.
					
		static int	MIN_VALUE
					A constant holding the minimum value an int can have, -231.
 	
 	
 		static String	toBinaryString(int i)
						Returns a string representation of the integer argument as an unsigned integer in base 2.
						
		static String	toHexString(int i)
						Returns a string representation of the integer argument as an unsigned integer in base 16.
						
		static String	toOctalString(int i)
						Returns a string representation of the integer argument as an unsigned integer in base 8.
						
 * 		static String	toString(int i)
						Returns a String object representing the specified integer.
						
				String	toString()
						Returns a String object representing this Integer's value.

 * 		static Integer	valueOf(int i)
						Returns an Integer instance representing the specified int value.
						
		static Integer	valueOf(String s)
						Returns an Integer object holding the value of the specified String.
						
		int		intValue()
				Returns the value of this Integer as an int.
						
	static int	parseInt(String s)
				Parses the string argument as a signed decimal integer.
		
 */

public class IntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("-----------------------------------------------------------------------");
		
		//int类型 和 String 类型 相互转换
		
		// int --> String
		
		int num = 100;
		String s = " " + 100;
		System.out.println("s : " + s);
		
		
		String s2 = String.valueOf(num);
		System.out.println("s2 : " + s2);
		
		String s3 = Integer.toString(num);
		System.out.println("s3 : " + s3);
		
		Integer in = new Integer(num);
		String s4 = in.toString();
		System.out.println("s4 : " + s4);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//String --> int
		
		String ss = "100";               //String ss = "Java" ; NumberFormatException
		Integer inn = new Integer(ss);
		int x = inn.intValue();
		System.out.println("x : " + x);
		
		int y = Integer.parseInt(ss);
		System.out.println("y :" + y);
		
		
		
		
	}

}
