package cn.itcast_02;

import java.lang.reflect.Constructor;

//通过反射获取带参构造方法

public class ReflectDemo2 {
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("cn.itcast_01.Person");
		
		Constructor con  = c.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("林青霞",27,"北京");
		System.out.println(obj);
		
	}

}
