package cn.itcast_04;

import java.util.Arrays;
import java.util.List;

/**
 * 				Class  Arrays
 * 
 * 		static <T> List<T>	asList(T... a)
							Returns a fixed-size list backed by the specified array.
 */

public class ArraysDemo {
	public static void main(String[] args) {
		
		String [] arrStr = {"hello","world","java"};
		List<String> li = Arrays.asList(arrStr);
		
		
		List<String> li2 = Arrays.asList("hello", "world","java","haha");
		
		//UnsupportedOperationException
		//li2.add("javaee");
		//UnsupportedOperationException
		//li2.remove(1);
		li2.set(2, "javaee");  //数组转成集合后，长度不能变
		
		
		
	
		for(String s : li2){
			System.out.println(s);
		}
	}

}
