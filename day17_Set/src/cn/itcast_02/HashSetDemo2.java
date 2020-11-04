package cn.itcast_02;

import java.util.HashSet;

//存储自定义对象并遍历

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> hs  = new HashSet<Student>();
		Student s1 = new Student("林青霞",26);
		Student s2 = new Student("王祖贤",23);
		Student s3 = new Student("范冰冰",36);
		Student s4 = new Student("林青霞",26);
		Student s5 = new Student("林高",6);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		
		for(Student s : hs){
			System.out.println(s.getName() + ":" + s.getAge());
		}
		
	}

}
