package cn.itcast_02;

/**
 * 		静态导入：
 * 			import static 包名.类名.方法名
 * 
 * 
 * 		import static java.lang.Math.abs;
 *		import static java.lang.Math.pow;
 *		import static java.lang.Math.max;
 */


import  java.lang.Math;

public class StaticImportDemo {
	public static void main(String[] args) {
		
//		System.out.println(abs(-1));
//		System.out.println(pow(2, 3));
//		System.out.println(max(2,4));
		
		System.out.println(Math.abs(-1));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.max(2,4));
		
		
		
	}

}
