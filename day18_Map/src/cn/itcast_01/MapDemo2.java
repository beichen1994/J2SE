package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();

	
		ma.put("�˳�", "��ٳ");
		ma.put("������", "��ӱ");
		ma.put("�ܽ���", "����");
		
		System.out.println("get()"+ ma.get("�ܽ���"));
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
