package cn.itcast_03;

/**
 * 			Class String
 * 		boolean	equals(Object anObject)
				Compares this string to the specified object.
				
		boolean	equalsIgnoreCase(String anotherString)
				Compares this String to another String, ignoring case considerations.(忽略大小写)
		
				
		boolean	contains(CharSequence s)
				Returns true if and only if this string contains the specified sequence of char values.
				
		boolean	startsWith(String prefix)
				Tests if this string starts with the specified prefix
				
		boolean	endsWith(String suffix)
				Tests if this string ends with the specified suffix.
				
		boolean	isEmpty()
				Returns true if, and only if, length() is 0.
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		
		String s1 ="helloworld";
		String s2 ="helloworld";
		String s3 ="HelloWorld";
		
		System.out.println("equals:" + s1.equals(s2));          
		System.out.println("equals:" + s1.equals(s3)); 			
		System.out.println("-------------------------------------");
		
		System.out.println("equals:" + s1.equalsIgnoreCase(s2) ); 
		System.out.println("equals:" + s1.equalsIgnoreCase(s3));
		System.out.println("--------------------------------------");
		
		System.out.println("contains:" + s1.contains("hello"));
		System.out.println("contains:" + s1.contains("hw"));
		System.out.println("--------------------------------------");
		
		System.out.println("startsWith:" + s1.startsWith("h"));
		System.out.println("startsWith:" + s1.startsWith("hello"));
		System.out.println("--------------------------------------");
		
		System.out.println("isEmpty:"  + s1.isEmpty());
		System.out.println("----------------------------------------");
		
		String s4 = "";
		String s5 = null;
		
		System.out.println("isEmpty"  + s4.isEmpty());
		System.out.println("isEmpty" + s5.isEmpty()); // NullPointerException,  s5不存在，不能调用方法
		
		
		
		
	}

}
