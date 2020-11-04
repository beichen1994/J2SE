package cn.itcast_05;

/**
 * 			Class String
 * 
 * 		byte[]	getBytes()
				Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
 *
 *		char[]	toCharArray()
				Converts this string to a new character array.
				
	static String	valueOf(char[] data)
					Returns the string representation of the char array argument.
				
	static String	valueOf(int i)
					Returns the string representation of the int argument.

	static String	valueOf(float f)
					Returns the string representation of the float argument.

	static String	valueOf(double d)
					Returns the string representation of the double argument.

	static String	valueOf(char c)
					Returns the string representation of the char argument.

	static String	valueOf(boolean b)
					Returns the string representation of the boolean argument.

	static String	valueOf(Object obj)
					Returns the string representation of the Object argument.
				
		String	toLowerCase()
				Converts all of the characters in this String to lower case using the rules of the default locale.
				
		String	toUpperCase()
				Converts all of the characters in this String to upper case using the rules of the default locale.
				
		String	concat(String str)
				Concatenates the specified string to the end of this string.
 */

public class StringDemo {
	public static void main(String[] args) {
		
		String s = "JavaSE";
		
		byte [] by = s.getBytes();
		for(int i = 0; i < by.length; i++){
			System.out.println(by[i]);
		}
		System.out.println("------------------------");
		
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++){
			System.out.println(ch[i]);
		}
		System.out.println("------------------------");
		
		String ss =String.valueOf(ch);
		System.out.println(ss);
		System.out.println("---------------");
		
		int i = 100;
		String sss = String.valueOf(i);
		System.out.println(sss);
		System.out.println("-------------------------");
		
		System.out.println("toLowerCase:" + s.toLowerCase());
		System.out.println("toUpperCase:" + s.toUpperCase());
		System.out.println("-------------------------------");
		
		String s1 = "hello";
		String s2 = "world";
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("------------------------------------");
		
		
		
		
		
	}

}
