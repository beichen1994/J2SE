package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����Դ��
 * 		C:\\jfile\\С����1.jpg   ----��ȡ���� -----FileInputStream
 * Ŀ�ĵأ�
 * 		mn.jpg ----д������ ---FileOutputStream
 *
 */
public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\jfile\\С����1.jpg");
		
		FileOutputStream fos = new FileOutputStream("mn.jpg");
		
		int b = 0;
	
		while((b = fis.read()) != -1){
			fos.write(b);
			
		}
			
		
		
		
		fis.close();
		fos.close();
		
	}
}
