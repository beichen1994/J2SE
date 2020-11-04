package cn.itcast_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
//ArrayList 存储自定义对象并排序

public class CollectionsDemo {
	public static void main(String[] args) {
		
		List<Student>  arr = new ArrayList<Student>();
		
		Student s1  = new Student("zhouxingchi" ,12);
		Student s2 = new Student("zhourunfa" ,23);
		Student s3 = new Student("zhoujielun",43);
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		
		//自然排序和比较器排序同时出现，采用比较器排序
		Collections.sort(arr,new Comparator<Student>(){
			public int compare(Student s1, Student s2){
					int  num = s1.getAge() - s2.getAge();
					int num2 =  num ==0 ? s1.getName().compareTo(s2.getName()): num;
					return num2;
			}
		});
		
		for(Student s : arr){
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
