package cn.itcast_08;


import java.util.Comparator;
import java.util.TreeSet;

import cn.itcast_07.Student;




public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>(){    //匿名内部类
			public int compare(Student s1, Student s2) {
				//姓名长度
				int num = s1.getName().length() - s2.getName().length();
				//姓名内容 
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				//年龄
				int num3 = num2 ==0 ? s1.getAge() - s2.getAge() : num2;
				return num3;
			}
		});
		
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
