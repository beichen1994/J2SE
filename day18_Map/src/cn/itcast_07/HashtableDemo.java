package cn.itcast_07;

import java.util.Hashtable;

/**
 * 			HashMap和Hashtable 的区别
 * 		Hashtable : 线程安全，不允许null键和null值
 * 		HashMap: 线程不安全，允许null键和null值
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
