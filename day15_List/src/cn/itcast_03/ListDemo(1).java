package cn.itcast_03;

import java.util.List;
import java.util.ArrayList;
////List ����(�洢��ȡ����Ԫ��һ��) ���ظ�

/**
 			Interface  List
 			
 	
 	 ���
 	void  add(int index, E element)
		  Inserts the specified element at the specified position in this list (optional operation).
 	
 	��ȡ
 	E	get(int index)
		Returns the element at the specified position in this list.
 
 	ɾ��
 	E	remove(int index)
		Removes the element at the specified position in this list (optional operation).
 
 	�޸�
 	E	set(int index, E element)
		Replaces the element at the specified position in this list with the specified element (optional operation).
 */

public class ListDemo {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add("hello");
		l.add("world");
		l.add("java");
		
		//l.add(1, "andriod");
		//l.add(11, "haha");  IndexOutOfBoundsException
		//System.out.println("get: " + l.get(1));
		//System.out.println("remove: " + l.remove(1));
		//System.out.println("set: " + l.set(1, "kongfu"));
		
		System.out.println("l: " +  l);
	}

}
