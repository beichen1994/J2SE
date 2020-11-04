package cn.itcast_06;

/**
 * 			Class StringBuffer
 * 		String	substring(int start)
				Returns a new String that contains a subsequence of characters currently contained in this character sequence.
				
		String	substring(int start, int end)
				Returns a new String that contains a subsequence of characters currently contained in this sequence.
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println("sb: " + sb);
		
		String s = sb.substring(5);
		System.out.println("s: " + s);
		
		String ss = sb.substring(5, 10);
		System.out.println("ss: " + ss);
	}

}
