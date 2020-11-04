package cn.itcast_04;

public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1 = new Student("ºúçê¿¨",22);
		
		Object obj = s1.clone();
		Student s2 = (Student)obj;
		
		Student s3 = s1;
		
		System.out.println(s1.getName() + ":" + s1.getAge());
		System.out.println(s2.getName() + ":" + s2.getAge());
		System.out.println(s3.getName() + ":" + s3.getAge());
		
		s3.setName("¿âÅÁÌá");
		s3.setAge(22);
		
		System.out.println(s1.getName() + ":" + s1.getAge());
		System.out.println(s2.getName() + ":" + s2.getAge());
		System.out.println(s3.getName() + ":" + s3.getAge());
	}

}
