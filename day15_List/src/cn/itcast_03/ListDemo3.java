package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;



public class ListDemo3 {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		Student s1 = new Student("Calm",22);
		Student s2 = new Student("Mike",21);
		Student s3 = new Student("Miachel",23);
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		
		for(int i = 0; i < l.size(); i++){
			Student s = (Student)l.get(i);
			System.out.println(s.getName() + "-----" + s.getAge());
		}
		
		
	}

}
