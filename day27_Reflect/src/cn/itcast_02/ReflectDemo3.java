package cn.itcast_02;

import java.lang.reflect.Constructor;

//ͨ�������ȡ˽�й��췽��

public class ReflectDemo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("cn.itcast_01.Person");
		
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		
		Object obj = con.newInstance("������",33);
		System.out.println(obj);
		
	}
}
