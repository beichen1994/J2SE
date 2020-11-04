package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;


//HashMap 基于哈希表保证键的唯一
public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("it001", "马云");
		hm.put("it002", "马化腾");
		hm.put("it003", "张朝阳");
		hm.put("it004", "比尔盖茨");
		
		Set<String> set = hm.keySet();
		for(String key: set){
			String value = hm.get(key);
			System.out.println(key + "---" + value);
			
			
		}
		
	}

}
