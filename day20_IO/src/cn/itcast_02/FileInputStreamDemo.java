package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 			Class FileInputStream
 * 		FileInputStream(File file)
		Creates a FileInputStream by opening a connection to an actual file, the file named by the File object file in the file system.
 *
 *		FileInputStream(String name)
		Creates a FileInputStream by opening a connection to an actual file, the file named by the path name name in the file system.
		
		int	read()  һ�ζ�ȡһ���ֽ� �� �ٴζ�ȡ���ȡ��һ���ֽ�
			Reads a byte of data from this input stream.
			
		int	read(byte[] b)  һ�ζ�ȡһ���ֽ�����
			Reads up to b.length bytes of data from this input stream into an array of bytes.
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("fis.txt");
		
	/**
		int b = fis.read();  
		System.out.println(b);   
		System.out.println((char)b);
		
	
		 b = fis.read();
		System.out.println(b);   
		System.out.println((char)b);
		
		 b = fis.read();
		System.out.println(b);   
		System.out.println((char)b);
		
		b = fis.read();
		System.out.println(b);   
		System.out.println((char)b);
		
	*/
	/**
		int b ;
		for(int i = 0 ; i < 4 ;i ++){
			b = fis.read();
			System.out.println(b);   
			System.out.println((char)b);
		}
		
		*/
		
		//ͨ�����ԣ����ļ�����-1ʱ���͵�ĩβ��
		int b = fis.read();
		while(b != -1){
			System.out.println(b);
			System.out.println((char)b);
			 b = fis.read();
		}
		
		fis.close();
	}

}
