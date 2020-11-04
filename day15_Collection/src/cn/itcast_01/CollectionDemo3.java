package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

//	遍历集合

/**
 * 				Interface Collection
 * 			
			
		Object[]	toArray()
					Returns an array containing all of the elements in this collection.			
				
		
 *
 *
 */

public class CollectionDemo3 {
	public static void main(String[] args) {
		
			Collection c = new ArrayList();
			
			c.add("hello");
			c.add("world");
			c.add("java");
			
			Object [] obj = c.toArray();
			
			for(int i = 0; i <obj.length;i++ ){
				System.out.println(obj[i]);
				
				//System.out.println(obj[i].length());   Object类中没有length()方法
				String s = (String)obj[i];
				System.out.println(s.length());
			}
	}
}
