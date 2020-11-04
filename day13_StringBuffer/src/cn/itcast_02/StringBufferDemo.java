 
 package cn.itcast_02;
/**
 * 			Class StringBuffer
						
		StringBuffer	append(char[] str)
						Appends the string representation of the char array argument to this sequence.

		StringBuffer	append(char[] str, int offset, int len)
						Appends the string representation of a subarray of the char array argument to this sequence.

		StringBuffer	append(int i)
						Appends the string representation of the int argument to this sequence.

		StringBuffer	append(double d)
						Appends the string representation of the double argument to this sequence.

		StringBuffer	append(float f)
						Appends the string representation of the float argument to this sequence.

		StringBuffer	append(char c)
						Appends the string representation of the char argument to this sequence.

  		StringBuffer	append(boolean b)
						Appends the string representation of the boolean argument to the sequence.

		StringBuffer	append(Object obj)
						Appends the string representation of the Object argument.

		StringBuffer	append(String str)
						Appends the specified string to this character sequence.

		StringBuffer	append(StringBuffer sb)
						Appends the specified StringBuffer to this sequence.
						
						
						
						
		StringBuffer	insert(int offset, char[] str)
						Inserts the string representation of the char array argument into this sequence.
						
		StringBuffer	insert(int offset, int i)
						Inserts the string representation of the second int argument into this sequence.
						
		StringBuffer	insert(int offset, double d)
						Inserts the string representation of the double argument into this sequence.
						
		StringBuffer	insert(int offset, float f)
						Inserts the string representation of the float argument into this sequence.
						
		StringBuffer	insert(int offset, char c)
						Inserts the string representation of the char argument into this sequence.
						
		StringBuffer	insert(int offset, boolean b)
						Inserts the string representation of the boolean argument into this sequence.

		StringBuffer	insert(int offset, Object obj)
						Inserts the string representation of the Object argument into this character sequence.
						
		StringBuffer	insert(int offset, String str)
						Inserts the string into this character sequence.


 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		StringBuffer sb2 = sb.append("hello");  //返回StringBuffer本身，只不过换了个名字
		System.out.println("sb: " + sb);
		System.out.println("sb2:" + sb2);
		System.out.println(sb == sb2);
		System.out.println("-----------------------------------");
		
		
		sb.append("world").append(10);
		System.out.println("sb:" + sb);
		System.out.println("---------------------------------------");
		
		sb.insert(5, "ak47");
		System.out.println("sb: " + sb);
		
	}

}
