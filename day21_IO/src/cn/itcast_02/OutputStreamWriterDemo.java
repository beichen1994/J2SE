package cn.itcast_02;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 			Class OutputStreamWriter
 * 		OutputStreamWriter(OutputStream out)
		Creates an OutputStreamWriter that uses the default character encoding.
		
		OutputStreamWriter(OutputStream out, String charsetName)
		Creates an OutputStreamWriter that uses the named charset.
		
		字符流 = 字节流 + 编码表
		
		void	write(int c)
				Writes a single character.    注意传入int 型，写一个字符
				
		void	write(String str, int off, int len)
				Writes a portion of a string.            写一个字符串
				
		void	write(char[] cbuf, int off, int len)
				Writes a portion of an array of characters.    写一个字符数组的一部分
		void	flush()
				Flushes the stream.
 *
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), "GBK");
		
		
		osw.write("中国");
		
		osw.close();
		
		
		
	}

}
