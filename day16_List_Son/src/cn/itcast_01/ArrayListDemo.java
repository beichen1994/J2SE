package cn.itcast_01;

import java.util.ArrayList;

//ArrayList ´æ´¢×Ö·û´®²¢±éÀú

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
		for(int i = 0; i < array.size(); i++){
			String s = (String)array.get(i);
			System.out.println(i);
		}
	}
}
