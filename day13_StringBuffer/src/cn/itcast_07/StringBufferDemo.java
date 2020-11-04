package cn.itcast_07;

/**
 *				StringBuffer ºÍStringµÄ×ª»» 	
 *			
 *				Class  StringBuffer
 *			StringBuffer(String str)
			Constructs a string buffer initialized to the contents of the specified string.
			
		StringBuffer	append(String str)
						Appends the specified string to this character sequence.
					
				String	toString()
						Returns a string representing the data in this sequence.
				Class String
		  String(StringBuffer buffer)
		  Allocates a new string that contains the sequence of characters currently contained in the string buffer argument.
			
		
 */			


public class StringBufferDemo {
	public static void main(String[] args) {
			
			String s = "hello";
			StringBuffer sb = new StringBuffer(s);
			System.out.println("sb : " + sb);
			
			StringBuffer sb2 = new StringBuffer();
			sb2.append(s);
			System.out.println("sb2 : " + sb2);
			System.out.println("----------------------------------------");
			
			StringBuffer ssb= new StringBuffer("java");
			String ss  = new String(ssb);
			System.out.println("ss: " + ss);
			String sss = ssb.toString();
			System.out.println("sss: " + sss);
	}

}
