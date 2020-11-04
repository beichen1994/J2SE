package cn.itcast_01;

//StringBuffer ���ݺͳ��ȿɱ䣬������ַ���ƴ�ӣ������˷�̫����Դ

/**
 *				Class StringBuffer
 *			StringBuffer()
			Constructs a string buffer with no characters in it and an initial capacity of 16 characters
			
			StringBuffer(int capacity)
			Constructs a string buffer with no characters in it and the specified initial capacity.
			
			StringBuffer(String str)
			Constructs a string buffer initialized to the contents of the specified string.
			
			String	toString()
					Returns a string representing the data in this sequence.
			
			int	length()
				Returns the length (character count).
				
			int	capacity()
				Returns the current capacity.
				
			
 *		
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("sb.capacity:" + sb.capacity());
		System.out.println("sb.length: " + sb.length());
		System.out.println("---------------------------------------");
		
		StringBuffer sb2 = new StringBuffer(50);
		System.out.println("sb.capacity:" + sb2.capacity());
		System.out.println("sb.length: " + sb2.length());
		System.out.println("---------------------------------------");
		
		StringBuffer sb3 = new StringBuffer("hello");
		System.out.println("sb.capacity:" + sb3.capacity());
		System.out.println("sb.length: " + sb3.length());
		System.out.println("---------------------------------------");
		
		
	}

}
