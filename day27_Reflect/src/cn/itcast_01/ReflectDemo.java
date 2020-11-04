package cn.itcast_01;
/**
 * 				��ȡ.class�ļ�����ķ�ʽ
 * 
 * 			Class Object
 * 		Class<?>	getClass()	
					Returns the runtime class of this Object.
 * 
 * 		�����������ͺ��������͵ľ�̬����class
 * 			int.class
 * 			String.class
 * 
 * 			Class Class
 * 	  static Class<?>  forName(String className)
					   Returns the Class object associated with the class or interface with the given string name.
 * 		
 */

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//��ʽ1
		Person p = new Person();
		Class c = p.getClass();
		
		Person p2 = new Person();
		Class c2 = p2.getClass();
		
		System.out.println(p == p2);
		System.out.println(c == c2);
		
		//��ʽ2
		Class c3 = Person.class;
		System.out.println(c == c3);
		
		//��ʽ3  
		Class c4 = Class.forName("cn.itcast_01.Person");
		System.out.println(c == c4);
		
		
	}
}
