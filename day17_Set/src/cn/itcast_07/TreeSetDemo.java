package cn.itcast_07;


import java.util.TreeSet;


public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>(new  MyComparator());
		
		Student s1 = new Student("zhangguorong",23);
		Student s2 = new Student("wangzuxian",26);
		Student s3 = new Student("zhourunfa",32);
		Student s4 = new Student("zhouxingchi",6);
		Student s5 = new Student("wangzuxian",6);
	
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for(Student s: ts){
			System.out.println(s.getName() + ":" + s.getAge()); 
		}
		
		
		
	}


}
