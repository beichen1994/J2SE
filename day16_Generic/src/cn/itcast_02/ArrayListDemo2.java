package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;

// �洢�Զ�����󲢱��������͸Ľ�

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		
		Student s1 = new Student("Paul",23);
		Student s2 = new Student("Catelina",13);
		Student s3 = new Student("Mike",3);
		
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		
		Iterator<Student> it = arr.iterator();
		while(it.hasNext()){
			Student st = it.next();
			System.out.println(st.getName() + "---"  + st.getAge());
		}
		
		for(int i = 0 ; i< arr.size(); i++){
			Student st2 = arr.get(i);
			System.out.println(s2.getName() + "----" + st2.getAge());
		}
		
		
		
	}
}
