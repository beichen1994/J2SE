package cn.itcast_03;

import java.io.File;

/**
 *  删除功能：
 *  boolean	delete()
			Deletes the file or directory denoted by this abstract pathname.
	
	java中的删除不走回收站
	只能逐级删除
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		
		File f1 = new File("c:\\jfile\\aaa\\1.txt");
		System.out.println("删除1.txt文件"+f1.delete());
		
		File f2 = new File("C:\\jfile\\bbb\\ok");
		System.out.println("删除ok文件夹"+ f2.delete());
		
		File f3 = new File("C:\\jfile\\bbb");
		System.out.println("删除bbb文件夹" + f3.delete());
		
	}

}
