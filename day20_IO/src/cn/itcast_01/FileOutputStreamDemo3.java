package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *   文本文件实现换行：
 *   	写入 换行符
 *   文本文件实现追加：
 *   		Class FileOutputStream
 *   	FileOutputStream(File file, boolean append)
		Creates a file output stream to write to the file represented by the specified File object.
 *
 */

public class FileOutputStreamDemo3 {
public static void main(String[] args) throws IOException {
	
	//FileOutputStream fos3 = new FileOutputStream("text3.txt");
	FileOutputStream fos3 = new FileOutputStream("text3.txt",true);
	
	for(int i = 0; i < 10; i++){
		fos3.write(("Hello:"+ i).getBytes());
		fos3.write("\r\n".getBytes());
	}
	
	
	fos3.close();
	
	
}
}
