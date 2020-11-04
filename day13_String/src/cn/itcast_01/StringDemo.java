package cn.itcast_01;

/**
 * 			Class String 
 * 		String()
		Initializes a newly created String object so that it represents an empty character sequence
 *
 *		String(byte[] bytes)
		Constructs a new String by decoding the specified array of bytes using the platform's default charset
		
		String(byte[] bytes, int offset, int length)
		Constructs a new String by decoding the specified subarray of bytes using the platform's default charset.
		
		String(char[] value)
		Allocates a new String so that it represents the sequence of characters currently contained in the character array argument.
		
		String(char[] value, int offset, int count)
		Allocates a new String that contains characters from a subarray of the character array argument.
		
		String(String original)
		Initializes a newly created String object so that it represents the same sequence of characters as the argument; in other words, the newly created string is a copy of the argument string.
			
		String(StringBuffer buffer)
		Allocates a new string that contains the sequence of characters currently contained in the string buffer argument.
 */
public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = new String();
		System.out.println("s1: " + s1 + ",s1.length():" + s1.length());
		System.out.println("------------");
		
		byte [] by = {97,98,99,100,101};
		String s2 = new String(by);
		System.out.println("s2: " + s2 + ",s2.length():" + s2.length());
		System.out.println("------------");
		
		String s3 = new String(by,1,3);
		System.out.println("s3: " + s3 + ",s3.length():" + s3.length());
		System.out.println("------------");
		
		char[] ch = {'a','b','c','d'};
		String s4 = new String(ch);
		System.out.println("s4: " + s4 + ",s4.length():" + s4.length());
		System.out.println("------------");
		
		String s5 = new String(ch,1,3);
		System.out.println("s5: " + s5 + ",s5.length():" + s5.length());
		System.out.println("------------");

		String s6 = new String("abcde");
		System.out.println("s6: " + s6 + ",s6.length():" + s6.length());
		System.out.println("------------");
		
		String s7 = "abcde";
		System.out.println("s7: " + s7 + ",s7.length():" + s7.length());
		System.out.println("------------");
		
		
		
	}

}
