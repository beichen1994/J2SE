package cn.itcast_01;

import java.util.ArrayList;

//ArrayList 存储自定义对象并遍历

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		Student s1 = new Student("Mike",12);
		Student s2 = new Student("Paul",22);
		Student s3 = new Student("Ben",15);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		for(int i = 0; i < array.size(); i++){
			Student s = (Student)array.get(i);
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}

}
