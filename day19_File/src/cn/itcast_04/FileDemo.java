package cn.itcast_04;

import java.io.File;

/**
 * boolean	renameTo(File dest)
			Renames the file denoted by this abstract pathname.
 *
 */
//绝对路径：C:\\jfile\\小黄人.jpg
//相对路径：小黄人.jpg

public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("c:\\jfile\\小黄人.jpg");
		
		File newf1 = new File("c:\\jfile\\小黄人1.jpg");
		System.out.println("重命名为" + f1.renameTo(newf1));
	}

}
