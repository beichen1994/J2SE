package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

// ArrayList��ȥ���ظ��ַ���
/**
 * 				�������϶�������ַ���Ԫ��
 * 				�����¼���
 * 				�����ɼ��ϣ���ȡ��Ԫ��
 * 				�����Ԫ��ȥ�¼������ң�
 * 					�У�������
 * 					û�У� ���
 * 				�����¼���
 *
 */


public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("hello");
		ar.add("world");
		ar.add("java");
		ar.add("hello");
		ar.add("love");
		ar.add("you");
		
		ArrayList ar2 = new ArrayList();
		
		Iterator it = ar.iterator();
		while(it.hasNext()){
			String s = (String)it.next();	
			if(!ar2.contains(s)){
				ar2.add(s);
			}
		}
		
		Iterator it2 = ar2.iterator();
		while(it2.hasNext()){
			String s = (String)it2.next();
			System.out.println(s);
		}
			
		}
		
		
	}

