package cn.itcast_04;

import java.io.File;

/**
 * boolean	renameTo(File dest)
			Renames the file denoted by this abstract pathname.
 *
 */
//����·����C:\\jfile\\С����.jpg
//���·����С����.jpg

public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("c:\\jfile\\С����.jpg");
		
		File newf1 = new File("c:\\jfile\\С����1.jpg");
		System.out.println("������Ϊ" + f1.renameTo(newf1));
	}

}
