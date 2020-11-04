package cn.itcast_02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<String ,Student> h = new HashMap<String, Student>();
		
		Student s1 = new Student("dsf",343);
		Student s2 = new Student("fgh",233);
		Student s3 = new Student("jhj",653);
		
		h.put("it1", s1);
		h.put("it2", s2);
		h.put("it3", s3);
		
		Set<String> se = h.keySet();
		for(String key : se){
			Student value = h.get(key);
			System.out.println(value.getName() + "----" + value.getAge());
		}
		
	}

}
