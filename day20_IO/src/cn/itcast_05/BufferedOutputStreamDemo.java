package cn.itcast_05;

import  java.io.*;

/**
 * 			Class BufferedOutputStream
 *   	BufferedOutputStream(OutputStream out)
		Creates a new buffered output stream to write data to the specified underlying output stream.
 *	
 *		BufferedOutputStream(OutputStream out, int size)
		Creates a new buffered output stream to write data to the specified underlying output stream with the specified buffer size.
 
  void	write(int b)
		Writes the specified byte to this buffered output stream.
		
  void	write(byte[] b, int off, int len)
         Writes len bytes from the specified byte array starting at offset off to this buffered output stream.
 *
 */
/**
 *   Ϊʲô������һ��������ļ������Ǵ��� Output Stream
 *   �ֽڻ������������ṩһ����������Ϊ��Ч����ơ������Ķ�д������Ҫ��������������ʵ��
 *
 */

public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//FileOutputStream fos = new FileOutputStream("bos.txt");
		//BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("bos.txt"));
		
		
		bos.write("hello".getBytes());
		
		bos.close();
	}

}