package cn.itcast_04;

/**
 * 			Class StringBuffer
 * 	
 * 		StringBuffer	replace(int start, int end, String str)
						Replaces the characters in a substring of this sequence with characters in the specified String.
 *
 */

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:" + sb);
		
		sb.replace(5, 10, "Ω⁄»’øÏ¿÷");
		System.out.println("sb: "+ sb);
	}

}
