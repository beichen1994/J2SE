package cn.itcast_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// HashMap Ƕ�� ArrayList

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("����");
		ar1.add( "���");
		hm.put("��������", ar1);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("�����");
		ar2.add( "��ƽ֮");
		hm.put("Ц������", ar2); 
		
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
