package cn.itcast_02;

import java.util.HashSet;

// HashSet ´æÈ¡×Ö·û´®²¢±éÀú

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		hs.add("java");
		
		for(String s : hs){
			System.out.println(s);
		
		}
		
	}
}
