package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

//ArrayList中去除重复字符串
// 拿0索引依次和后面的比较，若有重复的就干掉
//拿1索引....

public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("hello");
		ar.add("world");
		ar.add("hello");
		ar.add("java");
		ar.add("love");
		ar.add("you");
		ar.add("hello");
		ar.add("hello");
		
		for(int x =0; x < ar.size()-1; x++){
			for(int y =0; y< ar.size(); y++){
				if(ar.get(x).equals(ar.get(y))){
					ar.remove(y);
					y--;
				}
			}
		}
		
		Iterator it = ar.iterator();
		while(it.hasNext()){
			String s =(String)it.next();
			System.out.println(s);
		}
		
		
	}
}
