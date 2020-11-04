package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// HashMap 嵌套 ArrayList

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("吕布");
		ar1.add( "周瑜");
		hm.put("三国演义", ar1);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("令狐冲");
		ar2.add( "林平之");
		hm.put("笑傲江湖", ar2); 
		
		Set<String> se = hm.keySet();
		for(String key: se){
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for(String s : value){
				System.out.println( s);
			}
		}
	
	}
}
