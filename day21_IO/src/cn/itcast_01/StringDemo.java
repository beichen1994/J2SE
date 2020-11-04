package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 			Class String
 * 		String(byte[] bytes)
		Constructs a new String by decoding the specified array of bytes using the platform's default charset.		
 * 
 * 		String(byte[] bytes, Charset charset)
		Constructs a new String by decoding the specified array of bytes using the specified charset.
		
		byte[]	getBytes()
				Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
				
		byte[]	getBytes(Charset charset)
				Encodes this String into a sequence of bytes using the given charset, storing the result into a new byte array.
 *
 */
/**
 * 				Class Arrays
 * 		static String	toString(byte[] a)
						Returns a string representation of the contents of the specified array.
 *
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "你好";
		
		byte[]by = s.getBytes("GBK");
		System.out.println(Arrays.toString(by));   //把字节数组by 用字符串的形式表示出来，防止乱码
		
		String ss = new String(by,"GBK");
		System.out.println(ss);
		
		
	}

}
