package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
���� �� ��������ȷ�Ĺ����Ƴٵ���������͵��÷���
��ʽ�� <��������>

*/

public class GenericDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("hellow");
		arr.add("world");
		arr.add("java");
		
		//arr.add(new Integer(10));
		//arr.add(Integer.valueOf(10));
	
		
		Iterator<String> it  =  arr.iterator();
		while(it.hasNext()){
												
			//String s = (String)it.next();		//ClassCastException �� �洢�� String �� Integer �������ݣ�����ʱ��������String������
			
			String s = it.next();
			System.out.println(s);
		}
		
		
	}
}
