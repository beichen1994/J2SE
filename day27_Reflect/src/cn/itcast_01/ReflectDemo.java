package cn.itcast_01;
/**
 * 				获取.class文件对象的方式
 * 
 * 			Class Object
 * 		Class<?>	getClass()	
					Returns the runtime class of this Object.
 * 
 * 		基本数据类型和引用类型的静态属性class
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
		
		//方式1
		Person p = new Person();
		Class c = p.getClass();
		
		Person p2 = new Person();
		Class c2 = p2.getClass();
		
		System.out.println(p == p2);
		System.out.println(c == c2);
		
		//方式2
		Class c3 = Person.class;
		System.out.println(c == c3);
		
		//方式3  
		Class c4 = Class.forName("cn.itcast_01.Person");
		System.out.println(c == c4);
		
		
	}
}
