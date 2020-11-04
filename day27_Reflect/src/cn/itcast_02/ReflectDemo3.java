package cn.itcast_02;

import java.lang.reflect.Constructor;

//通过反射获取私有构造方法

public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");
		
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		
		Object obj = con.newInstance("风清扬",33);
		System.out.println(obj);
		
	}
}
