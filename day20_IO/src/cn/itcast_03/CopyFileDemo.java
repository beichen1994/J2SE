package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����Դ��
 * 		a.txt   ----��ȡ���� -----FileInputStream
 * Ŀ�ĵأ�
 * 		b.txt ----д������ ---FileOutputStream
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
