package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/**
泛型 ： 把类型明确的工作推迟到创建对象和调用方法
格式： <引用类型>

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
												
			//String s = (String)it.next();		//ClassCastException ， 存储了 String 和 Integer 类型数据，遍历时，都当作String来处理
			
			String s = it.next();
			System.out.println(s);
		}
		
		
	}
}
