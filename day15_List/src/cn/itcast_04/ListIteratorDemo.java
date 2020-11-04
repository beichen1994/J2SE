package cn.itcast_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 			Interface List
 
	列表迭代器
ListIterator<E>	listIterator()
				Returns a list iterator over the elements in this list (in proper sequence).
 *
 */
/**
 *			Interface ListIterator extends Iterator
 *		
 *		boolean	hasNext()
				Returns true if this list iterator has more elements when traversing the list in the forward direction.
 
 		E	next()
			Returns the next element in the list and advances the cursor position.

		boolean	hasPrevious()
				Returns true if this list iterator has more elements when traversing the list in the reverse direction.
 
 		E	previous()
			Returns the previous element in the list and moves the cursor position backwards.
 
		ListIterator 必须先正向遍历，才能逆向遍历
		
 */	

public class ListIteratorDemo{
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add("hello");
		l.add("world");
		l.add("java");
		
		ListIterator lit = l.listIterator();
		while(lit.hasNext()){
			String s = (String)lit.next();
			System.out.println(s);
		}
		
		while(lit.hasPrevious()){
			String s = (String)lit.previous();
			System.out.println(s);
		}
		
		
		
		
	}
	
}