package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 					Interface Collection
 * 			
 * 			添加
 * 		boolean	addAll(Collection<? extends E> c)
				Adds all of the elements in the specified collection to this collection (optional operation).
			删除	
		boolean	removeAll(Collection<?> c)
				Removes all of this collection's elements that are also contained in the specified collection (optional operation).
				只要有一个元素被移除，就返回true
			
			包含
		boolean	containsAll(Collection<?> c)
				Returns true if this collection contains all of the elements in the specified collection.
				只有包含所有元素，才返回ture
				
			交集
		boolean	retainAll(Collection<?> c)
				Retains only the elements in this collection that are contained in the specified collection (optional operation).
 				A对B做交集，结果保存在A中，B不变
 				返回值表示A是否返生过改变
 				
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
