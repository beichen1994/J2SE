package cn.itcast_03;

/**
 * 			�ɱ���������巽��ʱ��֪���ö�����ٲ���
 * 				          ���η�  ����ֵ����   ����������������...  ���飩{
 * 
 * 										}
 */

public class ArgsDemo {
	public static void main(String[] args) {
		
	
		
		int a =10;
		int b = 20;
		int result = sum(a,b);
		System.out.println(result);
		
		int c = 30;
		int result2 = sum(a,b,c);
		System.out.println(result2);
		
		int d = 40;
		int result3 = sum(a,b,c,d);
		System.out.println(result3);s
		
		public int sum(int... a){
			int s = 0;
			
			for(int i :a){
				s += i;
			}
			return s;
		}
		
		
		
	}

	

}
