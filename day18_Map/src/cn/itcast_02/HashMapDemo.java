package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;


//HashMap ���ڹ�ϣ��֤����Ψһ
public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("it001", "����");
		hm.put("it002", "����");
		hm.put("it003", "�ų���");
		hm.put("it004", "�ȶ��Ǵ�");
		
		Set<String> set = hm.keySet();
		for(String key: set){
			String value = hm.get(key);
			System.out.println(key + "---" + value);
			
			
		}
		
	}

}
