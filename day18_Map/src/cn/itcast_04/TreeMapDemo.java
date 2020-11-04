package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<String,String> tm = new TreeMap<String,String>();
		
		tm.put("hello", "你好");
		tm.put("world", "世界");
		tm.put("java", "爪洼");
		tm.put("hello", "好");
	
		Set<String> se = tm.keySet();
		for(String key : se){
			String value = tm.get(key);
			System.out.println(key + "---" + value);
		}
	
	}
}
