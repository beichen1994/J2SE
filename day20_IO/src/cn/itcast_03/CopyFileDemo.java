package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据源：
 * 		a.txt   ----读取数据 -----FileInputStream
 * 目的地：
 * 		b.txt ----写出数据 ---FileOutputStream
 *
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("a.txt");
		
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		int b = 0;
	
		while((b = fis.read()) != -1){
			fos.write(b);
			
		}
			
		
		
		
		fis.close();
		fos.close();
		
	}
	

}
