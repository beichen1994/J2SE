package cn.itcast_07;

import java.util.Hashtable;

/**
 * 			HashMap��Hashtable ������
 * 		Hashtable : �̰߳�ȫ��������null����nullֵ
 * 		HashMap: �̲߳���ȫ������null����nullֵ
 *
 */

public class HashtableDemo {
	public static void main(String[] args) {
		
		Hashtable<String,String> ht = new Hashtable<String, String>();
		
		ht.put("it001", "hello");
		ht.put(null, "world");
		ht.put("jav", null);
		
		System.out.println(ht);
	
	}
}
