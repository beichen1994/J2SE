package cn.itcast_02;

import java.io.File;
import java.io.IOException;

/**
 *  �������ܣ�
 *  	boolean	mkdir()
				Creates the directory named by this abstract pathname
		
		boolean	mkdirs()
				Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.
 		
 		boolean	createNewFile()
				Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
 */
public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("c:\\jfile\\aaa");
		System.out.println("�����ļ���" + f1.mkdir());
		
		File f2 = new File("c:\\jfile\\bbb\\ok");   
		System.out.println("�����ļ���"+ f2.mkdirs());     
		
		File f3 = new File("c:\\jfile\\aaa\\1.txt");
		try {
			System.out.println("����txt�ļ�" + f3.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
