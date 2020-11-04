package cn.itcast_05;

import java.io.File;

/**
 * ÅÐ¶Ï¹¦ÄÜ£º
 *  	boolean	isDirectory()
				Tests whether the file denoted by this abstract pathname is a directory.
 *
 *		boolean	isFile()
				Tests whether the file denoted by this abstract pathname is a normal file.
				
		boolean	isHidden()
				Tests whether the file named by this abstract pathname is a hidden file.
				
		boolean	canRead()
				Tests whether the application can read the file denoted by this abstract pathname.
				
		boolean	canWrite()
				Tests whether the application can modify the file denoted by this abstract pathname
				
		boolean	exists()
				Tests whether the file or directory denoted by this abstract pathname exists.
 */
public class FileDemo {
	public static void main(String[] args) {
		File f = new File("a.txt");
		
		System.out.println("isDirectory" + f.isDirectory());
		System.out.println("isFile" + f.isFile());
		System.out.println("isHidden" + f.isHidden());
		System.out.println("canWrite" + f.canRead());
		System.out.println("canRead" + f.canWrite());
		System.out.println("exists" + f.exists());
		
	}

}
