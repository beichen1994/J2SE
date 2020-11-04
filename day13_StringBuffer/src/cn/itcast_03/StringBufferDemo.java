package cn.itcast_03;
/**
 * 				Class StringBuffer
 * 		StringBuffer	delete(int start, int end)
						Removes the characters in a substring of this sequence.
						
		StringBuffer	deleteCharAt(int index)
						Removes the char at the specified position in this sequence.
 *
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("Java");
		sb.deleteCharAt(1);
		sb.delete(5, 9);
		System.out.println(sb);
	}

}
