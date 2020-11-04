package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 *			class LinkedHashMap<K,V>	extends HashMap<K,V>
 *
 *		LinkedHashMap()
		Constructs an empty insertion-ordered LinkedHashMap instance with the default initial capacity (16) and load factor (0.75).
 *		
 *		LinkedHashMap(Map<? extends K,? extends V> m)
		Constructs an insertion-ordered LinkedHashMap instance with the same mappings as the specified map.
		
		
 */

//由哈希表和链表实现，哈希表确保唯一，链表确保有序

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String,String> l = new LinkedHashMap<String,String>();
		
		l.put("123", "hello");
		l.put("234", "world");
		l.put("454", "java");
	
		
		Set<String> se  = l.keySet();
		for(String key : se){
			String value = l.get(key);
			System.out.println(key + "---" + value);
		}
	}

}
