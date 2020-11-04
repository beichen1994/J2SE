package cn.itcast_03;

import java.util.LinkedList;

/**
 * 					Class LinkedList
 * 		
 * 				void	addFirst(E e)
						Inserts the specified element at the beginning of this list.
				void	addLast(E e)
						Appends the specified element to the end of this list.
						
				 E	  getFirst()
					  Returns the first element in this list.

				 E	  getLast()
					  Returns the last element in this list.

				 E	removeFirst()
					Removes and returns the first element from this list.
					
				E	removeLast()
					Removes and returns the last element from this list.
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("hello");
		ll.add("world");
		ll.add("java");
		
		ll.addFirst("haha");
		System.out.println("getFirst: " + ll.getFirst());
		System.out.println("removeFirst: " + ll.removeFirst());
		
		ll.addLast("haha");
		System.out.println("getLast: " + ll.getLast());
		System.out.println("removeLast: " + ll.removeLast());
		
		
		
		System.out.println("LinkedList: " + ll);
	}

}
