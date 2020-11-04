package cn.itcast_03;


public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("林青霞",30);
		Student s2 = new Student("林青霞",30);
		
		System.out.println(s1 == s2);    // false
		System.out.println(s1.equals(s2)); // true
	
		
	}

}
