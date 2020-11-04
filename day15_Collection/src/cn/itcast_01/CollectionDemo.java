package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 			Interface  Collection
 * 		
 * 		���
 * 		boolean	add(E e)
				Ensures that this collection contains the specified element (optional operation).
				���Ƿ���true����������ظ�Ԫ��
				
		ɾ��
		void	clear()
				Removes all of the elements from this collection (optional operation).
				
		boolean	remove(Object o)
				Removes a single instance of the specified element from this collection, if it is present (optional operation).
	
		����
		boolean	contains(Object o)
				Returns true if this collection contains the specified element.
				
		�ж�
		boolean	isEmpty()
				Returns true if this collection contains no elements.
		

		����
		int	size()
			Returns the number of elements in this collection.
 */

/**
 * 			Collection û��ֱ�ӵ�ʵ���࣬���ӽӿ�List��ʵ����ArrayList
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
