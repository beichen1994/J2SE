package cn.itcast_04;

import java.util.LinkedHashSet;

/**
 *		 class LinkedHashSet<E> extends HashSet<E>
 *		
 *		LinkedHashSet()
		Constructs a new, empty linked hash set with the default initial capacity (16) and load factor (0.75).

		LinkedHashSet(Collection<? extends E> c)
		Constructs a new linked hash set with the same elements as the specified collection.
		
		底层数据结构是HashMap和链表
		Hash Map保证元素唯一
		链表保证元素有序
 *
 */

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		
		for(String s : hs){
			System.out.println(s);
		}
		
		
	}

}
