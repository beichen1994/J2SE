package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();
		//ma.put("����", "�����P");
		//ma.put("����", "Ҧ��");
	
		ma.put("�˳�", "��ٳ");
		ma.put("������", "��ӱ");
		ma.put("�ܽ���", "����");
		
		//ma.clear();
		
		System.out.println("remove()" + ma.remove("������"));
		System.out.println("containsKey()" + ma.containsKey("������"));
		System.out.println("isEmpty()" + ma.isEmpty());
		
		System.out.println("size()" + ma.size());
		
	}
	
	
	
}
