package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 					Interface Collection
 * 			
 * 			���
 * 		boolean	addAll(Collection<? extends E> c)
				Adds all of the elements in the specified collection to this collection (optional operation).
			ɾ��	
		boolean	removeAll(Collection<?> c)
				Removes all of this collection's elements that are also contained in the specified collection (optional operation).
				ֻҪ��һ��Ԫ�ر��Ƴ����ͷ���true
			
			����
		boolean	containsAll(Collection<?> c)
				Returns true if this collection contains all of the elements in the specified collection.
				ֻ�а�������Ԫ�أ��ŷ���ture
				
			����
		boolean	retainAll(Collection<?> c)
				Retains only the elements in this collection that are contained in the specified collection (optional operation).
 				A��B�����������������A�У�B����
 				����ֵ��ʾA�Ƿ������ı�
 				
 */

public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Collection c2 = new ArrayList();
		c2.add("abc1");
		c2.add("abc2");
		c2.add("abc3");
		c2.add("hello");
		
		//System.out.println("addAll: " + c.addAll(c2));
		
		//System.out.println("removeAll: " + c.removeAll(c2));
		
		
		//System.out.println("containsAll: " + c.containsAll(c2));
		
		//System.out.println("retainAll: " + c.retainAll(c2));
		
		System.out.println("c: " + c);
		System.out.println("c2: " + c2);
		
	
		
		
	}

}
