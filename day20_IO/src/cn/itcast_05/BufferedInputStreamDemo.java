package cn.itcast_05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *  		Class BufferedInputStream
 *  	BufferedInputStream(InputStream in)
		Creates a BufferedInputStream and saves its argument, the input stream in, for later use.
		
		BufferedInputStream(InputStream in, int size)
		Creates a BufferedInputStream with the specified buffer size, and saves its argument, the input stream in, for later use.
 *		
 *		int	read()
			See the general contract of the read method of InputStream.
			
		int	read(byte[] b, int off, int len)
			Reads bytes from this byte-input stream into the specified byte array, starting at the given offset.
 */
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream( new FileInputStream("bis.txt"));
		
		/**
		int b = 0;
		while((b = bis.read()) != -1 ){
			System.out.println((char)b);
		};
		
		bis.close();
		*/
		
		
		System.out.println("---------");
		
		byte[] by = new byte[1024];
		int len = 0;
		while((len = bis.read(by))!= -1){
			System.out.println(new String(by,0,len));
			
		}
		
		bis.close();
		
		
		
	}

}
