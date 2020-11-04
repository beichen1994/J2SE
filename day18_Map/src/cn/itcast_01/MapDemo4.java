package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//Map集合遍历
/**
 * 			获取所有键值对对象集合
 * 			遍历键值对对象集合，的到每一个键值对对象
 * 			根据键值对对象获取键和值
 *
 */
public class MapDemo4 {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();

		
		ma.put("邓超", "孙俪");
		ma.put("黄晓明", "杨颖");
		ma.put("周杰伦", "昆凌");
		
		Set<Map.Entry<String,String>> set = ma.entrySet();
		
		for(Map.Entry<String, String> m : set){
			String key = m.getKey();
			String value= m.getValue();
			System.out.println(key + "----" + value);
		}
		
	}
}
