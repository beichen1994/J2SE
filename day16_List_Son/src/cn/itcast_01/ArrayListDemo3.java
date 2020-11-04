package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

// ArrayList中去除重复字符串
/**
 * 				创建集合对象并添加字符串元素
 * 				创建新集合
 * 				遍历旧集合，并取得元素
 * 				拿这个元素去新集合中找，
 * 					有：不搭理
 * 					没有： 添加
 * 				遍历新集合
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

