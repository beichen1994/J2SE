package cn.itcast_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  	Class FileOutputStream
 *   void	write(byte[] b)
			Writes b.length bytes from the specified byte array to this file output stream.
 *
 *	 void	write(byte[] b, int off, int len)
			Writes len bytes from the specified byte array starting at offset off to this file output stream.
 *	
 *	 void	write(int b)
			Writes the specified byte to this file output stream.
 */
public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//File f = new File("text2.txt");
		//FileOutputStream fos2 = new FileOutputStream(f);
		
		FileOutputStream fos2 = new FileOutputStream("text2.txt");
		
		fos2.write(97);
		fos2.write(98);
		
		byte [] b = {97,98,99};
		fos2.write(b);
		
		fos2.write(b, 0, 2);
		
		fos2.close();
		
		
		
	}

}
