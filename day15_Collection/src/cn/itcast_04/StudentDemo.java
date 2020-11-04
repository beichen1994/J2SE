package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast_02.Student;

public class StudentDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		Student s1 = new Student("Calm",22);
		Student s2 = new Student("Mike",21);
		Student s3 = new Student("Miachel",23);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		Iterator it = c.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		
	}

}
