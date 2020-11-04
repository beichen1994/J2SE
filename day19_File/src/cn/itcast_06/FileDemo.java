package cn.itcast_06;

import java.io.File;

/**
 * String	getAbsolutePath()
			Returns the absolute pathname string of this abstract pathname.
			
  String	getPath()
			Converts this abstract pathname into a pathname string.
			
   String	getName()
			Returns the name of the file or directory denoted by this abstract pathname.
			
   long	length()
		Returns the length of the file denoted by this abstract pathname.
		
  long	lastModified()
		Returns the time that the file denoted by this abstract pathname was last modified.
			
			
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		File f = new File("Demo\\test.txt");
		
		System.out.println("getAbsolutePath:" + f.getAbsolutePath());
		System.out.println("getPath:" + f.getPath());
		System.out.println("getName:" + f.getName());
		System.out.println("length:" + f.length());
		System.out.println("lastModified:" + f.lastModified());
	}

}
