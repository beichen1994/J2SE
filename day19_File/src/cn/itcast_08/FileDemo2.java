package cn.itcast_08;

import java.io.File;
import java.io.FilenameFilter;

/**
 *  	Class File
 *   String[]	list(FilenameFilter filter)
				Returns an array of strings naming the files and directories in the directory denoted by this abstract pathname that satisfy the specified filter.
 * 
 * 	 File[]	listFiles(FilenameFilter filter)
			Returns an array of abstract pathnames denoting the files and directories in the directory denoted by this abstract pathname that satisfy the specified filter.
 */

/**
 * 		Interface FilenameFilter
 * 	boolean	accept(File dir, String name)
			Tests if a specified file should be included in a file list.
 *
 */

public class FileDemo2 {
	public static void main(String[] args) {
		
		File f = new File("c:\\jfile");
		
		String [] arr = f.list(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				
				File f2 = new File( dir, name);
				boolean b =  f2.isFile();
				boolean b2 = name.endsWith("jpg");
				return b && b2;
				
			}
		});
		
		for(String str : arr){
			System.out.println(str);
		}
		
	}

}
