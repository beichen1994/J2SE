package cn.itcast_05;

import java.util.TreeSet;


/**
 * 			class TreeSet<E>   implements NavigableSet<E>
 * 		The elements are ordered using their natural ordering, or by a Comparator provided at set creation time, depending on which constructor is used.
 *		
 *		TreeSet()
		Constructs a new, empty tree set, sorted according to the natural ordering of its elements.TreeSet()
		
		TreeSet(Comparator<? super E> comparator)
		Constructs a new, empty tree set, sorted according to the specified comparator.
 *		
 *		TreeSet(SortedSet<E> s)
		Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set.
 *	
	
 *		�ײ����ݽṹ��Tree Map TreeMap �ײ����ݽṹ�Ǻ����
 *		Tree Map��֤Ψһ
 *		�������֤����
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(10);
		ts.add(32);
		ts.add(34);
		ts.add(45);
		ts.add(2);
		
		for(Integer in : ts){
			System.out.println(in);
		}
	}

}
