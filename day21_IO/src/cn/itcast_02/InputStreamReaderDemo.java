package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * 			Class InputStreamReader
 * 		InputStreamReader(InputStream in)
		Creates an InputStreamReader that uses the default charset.
		
		InputStreamReader(InputStream in, String charsetName)
		Creates an InputStreamReader that uses the named charset.
		
		int	read()
			Reads a single character.
			
		int	read(char[] cbuf, int offset, int length)
			Reads characters into a portion of an array.
 *
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException{  
		
		//InputStreamReader isr = new InputStreamReader( new FileInputStream("isr.txt"));
		
		InputStreamReader isr = new InputStreamReader( new FileInputStream("isr.txt") , "GBK");
		
		int b = 0;
		
		while((b = isr.read()) != -1){              //一次读取一个字符
			System.out.println((char)b);
		}
		
		
	}

}
