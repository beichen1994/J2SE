package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();

	
		ma.put("µË³¬", "ËïÙ³");
		ma.put("»ÆÏşÃ÷", "ÑîÓ±");
		ma.put("ÖÜ½ÜÂ×", "À¥Áè");
		
		System.out.println("get()"+ ma.get("ÖÜ½ÜÂ×"));
		System.out.println("-------------------");
		
		Set<String> se = ma.keySet();
		for(String k: se){
			System.out.println(k);
		}
		System.out.println("--------------------------");
		
		Collection<String> con = ma.values();
		for(String va : con){
			System.out.println(va);
		}
		
	}

}
