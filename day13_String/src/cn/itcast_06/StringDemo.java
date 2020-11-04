package cn.itcast_06;

/**
 * 				Class String
 * 
 * 		String	replace(char oldChar, char newChar)
				Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
 *	
 *		String	replaceFirst(String regex, String replacement)
				Replaces the first substring of this string that matches the given regular expression with the given replacement.
				
		String	replaceAll(String regex, String replacement)
				Replaces each substring of this string that matches the given regular expression with the given replacement.
				
		String	trim()
				Returns a string whose value is this string, with any leading and trailing whitespace removed.
				
		int	compareTo(String anotherString)
			Compares two strings lexicographically.	
			
		int	compareToIgnoreCase(String str)
			Compares two strings lexicographically, ignoring case differences.
 */
public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		String s3 = s1.replaceFirst("owo", "ak47");
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);
		System.out.println("----------------------");
		
		
		String s4 = "hello world";
		String s5 = s4.trim();
		System.out.println("s4 : " + s4);
		System.out.println("s5" + s5);
		System.out.println("----------------------------------");
		
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abcc";
		System.out.println(s6.compareTo(s7));    //h-h =0
		System.out.println(s6.compareTo(s8)); 	 //h-1 =7
		System.out.println("---------------------------------");
		
		
	}

}
