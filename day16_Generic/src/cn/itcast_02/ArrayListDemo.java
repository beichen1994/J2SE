package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;

// �洢�ַ��������������͸Ľ�

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arr  = new ArrayList<String>();
		
		arr.add("hello");
		arr.add("world");
		arr.add("java");
		
		Iterator<String> it = arr.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("-----------------------------------");
		
		for(int i = 0; i< arr.size(); i++){
			String s = arr.get(i);
			System.out.println(s);
		}
		
		
	}

}
