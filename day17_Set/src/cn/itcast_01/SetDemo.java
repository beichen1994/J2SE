package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * 		Collection 
 * 			List(有序，可重复)
 * 			
 * 			Set(无序，唯一)
 *		
 *		Interface Set<E>
 *
 *	boolean	add(E e)
			Adds the specified element to this set if it is not already present (optional operation).

	boolean	addAll(Collection<? extends E> c)
			Adds all of the elements in the specified collection to this set if they're not already present (optional operation).	
 */

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("java");
		
		for(String s: set){
			System.out.println(s);
			
		}
	}

}
