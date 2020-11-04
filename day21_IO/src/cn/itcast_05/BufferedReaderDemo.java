package cn.itcast_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 			 Class BufferedReader
 * 		BufferedReader(Reader in)
		Creates a buffering character-input stream that uses a default-sized input buffer.
		
		BufferedReader(Reader in, int sz)
		Creates a buffering character-input stream that uses an input buffer of the specified size.
		
		int	read()
			Reads a single character.   		一次读取一个字符
			
		int	read(char[] cbuf, int off, int len)
			Reads characters into a portion of an array		 一次读取一个字符串
		
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("br.txt"));
		
		char[] ch = new char[1024];
		int len = 0;
		while((len = br.read(ch)) != -1){
			System.out.println( new String(ch,0,len));
		}
		
		br.close();
		
		
	}

}
