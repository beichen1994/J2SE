package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();
		//ma.put("ÎÄÕÂ", "ÂíÒÁ¬P");
		//ma.put("ÎÄÕÂ", "Ò¦µÑ");
	
		ma.put("µË³¬", "ËïÙ³");
		ma.put("»ÆÏşÃ÷", "ÑîÓ±");
		ma.put("ÖÜ½ÜÂ×", "À¥Áè");
		
		//ma.clear();
		
		System.out.println("remove()" + ma.remove("»ÆÏşÃ÷"));
		System.out.println("containsKey()" + ma.containsKey("»ÆÏşÃ÷"));
		System.out.println("isEmpty()" + ma.isEmpty());
		
		System.out.println("size()" + ma.size());
		
	}
	
	
	
}
