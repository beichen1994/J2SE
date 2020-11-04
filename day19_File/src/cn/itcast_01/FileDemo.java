package cn.itcast_01;

import java.io.File;

/**
 * 		Class File
 * 	File(String pathname)
	Creates a new File instance by converting the given pathname string into an abstract pathname
 *	
 *	File(String parent, String child)
	Creates a new File instance from a parent pathname string and a child pathname string.
 
 	File(File parent, String child)
	Creates a new File instance from a parent abstract pathname and a child pathname string.
 */
public class FileDemo {
	public static void main(String[] args) {
		File file  =  new File("C:\\jfile\\1.txt");
		
		File file2 = new File("C:\\jfile","1.txt");
		
		File file3 = new File("C:\\jfile");
		File file4 = new File(file3,"1.txt");
		
	}

}
