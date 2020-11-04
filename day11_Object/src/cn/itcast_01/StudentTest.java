package cn.itcast_01;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		int a = s1.hashCode();
		System.out.println(a);
		
		Student s2 = new Student();
		int b = s2.hashCode();
		System.out.println(b);
		
		Student s3 = new Student();
		Class c = s3.getClass();
		String str = c.getName();
		System.out.println(str);
	}

}
