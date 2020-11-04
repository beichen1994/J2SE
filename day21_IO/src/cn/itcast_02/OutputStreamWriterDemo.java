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
		
		�ַ��� = �ֽ��� + �����
		
		void	write(int c)
				Writes a single character.    ע�⴫��int �ͣ�дһ���ַ�
				
		void	write(String str, int off, int len)
				Writes a portion of a string.            дһ���ַ���
				
		void	write(char[] cbuf, int off, int len)
				Writes a portion of an array of characters.    дһ���ַ������һ����
		void	flush()
				Flushes the stream.
 *
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		
		//OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"), "GBK");
		
		
		osw.write("�й�");
		
		osw.close();
		
		
		
	}

}
