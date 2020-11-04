package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map 集合遍历
/**
 * 			获取所有键
 * 			根据键的集合，获取每一个键
 * 			根据键去找值
 *
 */

public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();

		
		ma.put("邓超", "孙俪");
		ma.put("黄晓明", "杨颖");
		ma.put("周杰伦", "昆凌");		
		
		Set<String> set = ma.keySet();
		for(String key:set){
			String value = ma.get(key);
			System.out.println(key + "----" + value);
		}
	}

}
