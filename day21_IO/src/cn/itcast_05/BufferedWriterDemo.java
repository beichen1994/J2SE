package cn.itcast_05;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 			Class BufferedWriter
 * 		BufferedWriter(Writer out)
		Creates a buffered character-output stream that uses a default-sized output buffer.
		
		BufferedWriter(Writer out, int sz)
		Creates a new buffered character-output stream that uses an output buffer of the given size.
		
		void	write(char[] cbuf, int off, int len)
				Writes a portion of an array of characters.
				
		void	write(int c)
				Writes a single character.
				
		void	write(String s, int off, int len)
				Writes a portion of a String.
				
		//提供单个字符 字符数组 字符串的高效写入
 */

public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		
		//BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(new FileOutputStream("bw.txt")));
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("bw.txt"));
		
		bw.write("Hello");
		bw.write("World");
		bw.write("Java");
		bw.flush();
		bw.close();
	}

}
