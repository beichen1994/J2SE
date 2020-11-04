package cn.itcast_04;

/**
 * 			Class String 
 * 		int	length()
			Returns the length of this string.
			
 * 		char charAt(int index)
			 Returns the char value at the specified index.
			 
		int	indexOf(int ch)
			Returns the index within this string of the first occurrence of the specified character.
		
		int	indexOf(String str)
			Returns the index within this string of the first occurrence of the specified substring.
			
		int	indexOf(int ch, int fromIndex)
			Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index
			
		int	indexOf(String str, int fromIndex)
			Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
			
		String	substring(int beginIndex)
				Returns a string that is a substring of this string.
				
		String	substring(int beginIndex, int endIndex)
				Returns a string that is a substring of this string.
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";
		
		System.out.println("s.length:" + s.length());
		System.out.println("--------------------------");
		
		System.out.println("s.charAt:" + s.charAt(6));
		System.out.println("--------------------------");
		
		System.out.println("s.indexOf:" + s.indexOf('w'));  //int indexOf(int ch);
		System.out.println("-----------------------------");
		
		System.out.println("s.indexOf:" + s.indexOf("wor"));
		System.out.println("-------------------------------");
		
		System.out.println("s.indexOf:" + s.indexOf('l', 4));
		System.out.println("---------------------------------");
		
		System.out.println("s.indexOf:" + s.indexOf("or", 2));
		System.out.println("---------------------------------");
		
		System.out.println("s.subString:" + s.substring(3));
		System.out.println("-------------------------------");
		
		System.out.println("s.subString:" + s.substring(3, 6));
		System.out.println("----------------------------------");
	}

}
