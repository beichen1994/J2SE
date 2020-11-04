package cn.itcast_04;
//Iterator ±éÀú

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Iterator it  = c.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			String s =(String)obj;
			System.out.println(s);
		}
		
		
	}

}
