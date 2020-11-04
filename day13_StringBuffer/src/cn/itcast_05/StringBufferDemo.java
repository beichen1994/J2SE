package cn.itcast_05;

/**
 * 			Class	StringBuffer
 *		StringBuffer	reverse()
						Causes this character sequence to be replaced by the reverse of the sequence.
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("œº«‡¡÷∞ÆŒ“");
		System.out.println("sb: " + sb);
		sb.reverse();
		System.out.println("sb: "+ sb);
	}

}
