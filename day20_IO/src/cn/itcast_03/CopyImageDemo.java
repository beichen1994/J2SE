package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据源：
 * 		C:\\jfile\\小黄人1.jpg   ----读取数据 -----FileInputStream
 * 目的地：
 * 		mn.jpg ----写出数据 ---FileOutputStream
 *
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\jfile\\小黄人1.jpg");
		
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		int b = 0;
	
		while((b = fis.read()) != -1){
			fos.write(b);
			
		}
			
		
		
		
		fis.close();
		fos.close();
		
	}
}
