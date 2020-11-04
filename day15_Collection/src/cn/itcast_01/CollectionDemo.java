package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 			Interface  Collection
 * 		
 * 		添加
 * 		boolean	add(E e)
				Ensures that this collection contains the specified element (optional operation).
				总是返回true，可以添加重复元素
				
		删除
		void	clear()
				Removes all of the elements from this collection (optional operation).
				
		boolean	remove(Object o)
				Removes a single instance of the specified element from this collection, if it is present (optional operation).
	
		包含
		boolean	contains(Object o)
				Returns true if this collection contains the specified element.
				
		判断
		boolean	isEmpty()
				Returns true if this collection contains no elements.
		

		长度
		int	size()
			Returns the number of elements in this collection.
 */

/**
 * 			Collection 没有直接的实现类，用子接口List的实现类ArrayList
 *
 */

public class CollectionDemo {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//c.clear();
		//c.remove("hello");
		
		System.out.println("contains: " + c.contains("hello"));
		System.out.println("contains: " + c.contains("andriod"));
		System.out.println("----------------------------------");
		
		System.out.println("isEmpty: " + c.isEmpty());
		System.out.println("----------------------------------");
		
		System.out.println("size: " + c.size());
		System.out.println("--------------------------------");
		
		System.out.println("c : " + c);
	}

}
