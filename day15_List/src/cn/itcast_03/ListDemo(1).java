package cn.itcast_03;

import java.util.List;
import java.util.ArrayList;
////List 有序(存储和取出的元素一致) 可重复

/**
 			Interface  List
 			
 	
 	 添加
 	void  add(int index, E element)
		  Inserts the specified element at the specified position in this list (optional operation).
 	
 	获取
 	E	get(int index)
		Returns the element at the specified position in this list.
 
 	删除
 	E	remove(int index)
		Removes the element at the specified position in this list (optional operation).
 
 	修改
 	E	set(int index, E element)
		Replaces the element at the specified position in this list with the specified element (optional operation).
 */

public class ListDemo {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add("hello");
		l.add("world");
		l.add("java");
		
		//l.add(1, "andriod");
		//l.add(11, "haha");  IndexOutOfBoundsException
		//System.out.println("get: " + l.get(1));
		//System.out.println("remove: " + l.remove(1));
		//System.out.println("set: " + l.set(1, "kongfu"));
		
		System.out.println("l: " +  l);
	}

}
