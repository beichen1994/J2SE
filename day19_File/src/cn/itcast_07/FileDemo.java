package cn.itcast_07;

import java.io.File;

/**
 *   获取功能
 *   String[]	list()
				Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname.
 *
 *	File[]	listFiles()
			Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.
 */

/**
for (循环变量类型 循环变量名称 : 要被遍历的对象) {
			循环体
	} 
*/



public class FileDemo {
	public static void main(String[] args) {
		File f = new File("c:\\");
		
		String [] str = f.list();
		for(String s :str){
			System.out.println(s);
		}
		System.out.println("---------------------------");
		
		File [] arrfile = f.listFiles();
		for(File f2 : arrfile){
			System.out.println(f2.getAbsolutePath());
		}
		
	}

}
