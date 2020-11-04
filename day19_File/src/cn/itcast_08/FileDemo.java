package cn.itcast_08;

import java.io.File;

/**
 *  判断某目录下是否有.jpg的文件，如果有则输出
 *  
 *  分析：
 *  		封装某目录
 *  		获取该目录下所有文件的文件数组
 *  		遍历File数组，得到每一个File对象
 *  		判断是否是文件
 *  			是：是否是.jpg
 *  				是：输出文件名称
 *  				否：不搭理
 *  			否：不搭理
 *
 */
/**
 * 	Class String
 * boolean	endsWith(String suffix)
			Tests if this string ends with the specified suffix.
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		File f  = new File("C:\\jfile");
		File[]arrfile = f.listFiles();
		for(File f2 : arrfile){
			if(f2.isFile()){
				if(f2.getName().endsWith("jpg")){
					System.out.println("文件为：" + f2.getName());
				}
				
			}
		}
	}

}
