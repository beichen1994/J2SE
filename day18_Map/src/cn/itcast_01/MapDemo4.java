package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//Map���ϱ���
/**
 * 			��ȡ���м�ֵ�Զ��󼯺�
 * 			������ֵ�Զ��󼯺ϣ��ĵ�ÿһ����ֵ�Զ���
 * 			���ݼ�ֵ�Զ����ȡ����ֵ
 *
 */
public class MapDemo4 {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();

		
		ma.put("�˳�", "��ٳ");
		ma.put("������", "��ӱ");
		ma.put("�ܽ���", "����");
		
		Set<Map.Entry<String,String>> set = ma.entrySet();
		
		for(Map.Entry<String, String> m : set){
			String key = m.getKey();
			String value= m.getValue();
			System.out.println(key + "----" + value);
		}
		
	}
}
