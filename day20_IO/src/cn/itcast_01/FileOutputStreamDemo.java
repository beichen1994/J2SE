package cn.itcast_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

  /**
   *  		 Class FileOutputStream
   *  	 FileOutputStream(File file)
		 Creates a file output stream to write to the file represented by the specified File object
		
		 FileOutputStream(String name)
		 Creates a file output stream to write to the file with the specified name.
		
   void	 write(byte[] b)
		 Writes b.length bytes from the specified byte array to this file output stream
   *
   */
/**
 *  		Class String
 *   	byte[]	getBytes()
				Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//File f = new File("test.txt");
		//FileOutputStream fos = new FileOutputStream(f);
		
		FileOutputStream  fos  = new FileOutputStream("test.txt");
		/**  
		 * 创建文件输出流对象做了几件事：
		 * 		调用系统功能去创建文件
		 * 		创建fos对象
		 * 		将fos 指向 文件
		 */
		
		fos.write("hello".getBytes());
		fos.close();
		/**
		 * 把流对象编程垃圾，便于垃圾回收器回收
		 * 通知系统去释放相关资源
		 */
	}

}
