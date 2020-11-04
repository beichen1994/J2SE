package cn.itcast_03;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
//		int a  = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println("a:" + a + ", b:" + b);
//		System.out.println("----------------");
		
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//		System.out.println("s1:" + s1 + "s2:" + s2);
//		System.out.println("----------------");
		
//		
//		String s1 = sc.nextLine();
//		int a = sc.nextInt();
//		System.out.println("s1:" + s1 + "a:" + a);
//		System.out.println("----------------");
		
//		int a = sc.nextInt();
//		String s1 = sc.nextLine();
//		System.out.println("s1:" + s1 + "a:" + a);
//		System.out.println("----------------");
//出问题，输入整数后，空格当作字符串赋给了s1；
		
		int a = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		String s1 = sc2.nextLine();
		System.out.println("s1:" + s1 + "a:" + a);
		System.out.println("----------------");
	
		
	}

}
