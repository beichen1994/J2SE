package cn.itcast_02;

import java.util.Scanner;

//��ȡ���ⷶΧ�ڵ������

public class MathDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ��");
		int start = sc.nextInt();
		System.out.println("�����������");
		int end = sc.nextInt();
		
		for(int i = 0 ;  i <100 ;i++){
			int num =MathDemo.getRandom(start, end);
			System.out.println(num);
		}
		
		
	}
	
	public static int getRandom(int start,int end){
		//int num = (int)Math.random()*100 + 1;
		int number = (int)(Math.random()*(end-start +1)) + start;
		return number ;
		
	}

}
