package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;

//List集合的特有遍历

public class ListDemo2 {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add("hello");
		l.add("world");
		l.add("java");
		
//		l.get(0);
//		l.get(1);
//		l.get(2);
		
		for(int i = 0; i < l.size(); i++){
			String s = (String)l.get(i);
			System.out.println(s);
		}
	}
	
}
