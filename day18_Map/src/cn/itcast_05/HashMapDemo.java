package cn.itcast_05;

import java.util.HashMap;
import java.util.Set;

//HashMap 嵌套 HashMap

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String,HashMap<String,Integer>> hmd = new HashMap<String, HashMap<String,Integer>>();
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("刘德华", 23);
		hm.put("周星星", 34);
		hmd.put("hm", hm);
		
		HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
		hm2.put("周润发", 45);
		hm2.put("李连杰", 43);
		hmd.put("hm2", hm2);
		
		Set<String> se = hmd.keySet();
		for(String key : se){
			HashMap<String ,Integer> value = hmd.get(key);
			Set<String> s = value.keySet();
			for(String ke:s){
				Integer val = value.get(ke);
				System.out.println(ke + "----" + val);
			}
		}
		

				
	}

}
