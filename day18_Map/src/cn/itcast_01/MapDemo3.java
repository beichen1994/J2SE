package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map ���ϱ���
/**
 * 			��ȡ���м�
 * 			���ݼ��ļ��ϣ���ȡÿһ����
 * 			���ݼ�ȥ��ֵ
 *
 */

public class MapDemo3 {
	public static void main(String[] args) {
		Map<String,String> ma = new HashMap<String,String>();

		
		ma.put("�˳�", "��ٳ");
		ma.put("������", "��ӱ");
		ma.put("�ܽ���", "����");		
		
		Set<String> set = ma.keySet();
		for(String key:set){
			String value = ma.get(key);
			System.out.println(key + "----" + value);
		}
	}

}
