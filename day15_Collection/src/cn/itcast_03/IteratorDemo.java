package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//  遍历集合
/**
 * 				Interface Collection
 * 		
 * 		Iterator<E>	iterator()
					Returns an iterator over the elements in this collection.
 */

/**				
 * 				Interface Iterator
  	boolean	hasNext()
			Returns true if the iteration has more elements.
	
	   E	next()
		    Returns the next element in the iteration.
		
default void  remove()
			  Removes from the underlying collection the last element returned by this iterator (optional operation).
 */

public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Iterator it =	c.iterator(); // 实际返回的子类对象，这里是多态 
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
		
		
	}

}
