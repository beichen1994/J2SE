package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		Student s1 = new Student("Calm",22);
		Student s2 = new Student("Mike",21);
		Student s3 = new Student("Miachel",23);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		Object [] obj = c.toArray();
		for(int i = 0; i<obj.length; i++ ){
			//System.out.println(obj[i]);
			
			Student s = (Student)obj[i];
			System.out.println(s.getName()+ "---" + s.getAge());
			
		}
		
		
	}

}
