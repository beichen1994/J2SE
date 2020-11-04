package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *       Class String
 *     String(byte[] bytes)
	   Constructs a new String by decoding the specified array of bytes using the platform's default charset.
	   
	   String(byte[] bytes, int offset, int length)
	   Constructs a new String by decoding the specified subarray of bytes using the platform's default charset.
 *
 */
/**
 * 			Class FileInputStream
 * 		int	read(byte[] b)  一次读取一个字节数组
			Reads up to b.length bytes of data from this input stream into an array of bytes.
 *
 */
public class FileInputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("fis2.txt");
		
		/**
		byte[] b = new byte[5];
		int len = fis.read(b);
		System.out.println(len);
		System.out.println(new String(b));
		
		 b = new byte[5];
	     len = fis.read(b);
		System.out.println(len);
		System.out.println(new String(b));
		
		txt文件中字符：
		  hello /r/n
		  world/r/n
		  java/r/n
		*/
		
		byte[] b = new byte[1024];
		int len = 0;
		while((len = fis.read(b))!= -1){
			System.out.println(new String(b));
		}
		
		
	}
	

}
