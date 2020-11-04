package cn.itcast_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//通过反射获取无参构造方法

/**
 * 			
 * 				Class	Class
	
		Constructor<?>[]	getConstructors()
							Returns an array containing Constructor objects reflecting all the public constructors of the class represented by this Class object. 
							获取所有公共构造方法
							
		Constructor<?>[]	getDeclaredConstructors()
							Returns an array of Constructor objects reflecting all the constructors declared by the class represented by this Class object.
 							获取所有构造方法
 							
	    Constructor<T>		getConstructor(Class<?>... parameterTypes)
							Returns a Constructor object that reflects the specified public constructor of the class represented by this Class object.
							获取单个公共构造方法
							
		Constructor<T>		getDeclaredConstructor(Class<?>... parameterTypes)
							Returns a Constructor object that reflects the specified constructor of the class or interface represented by this Class object.
							获取任意构造方法

 *
 */

/**					Class Constructor
 * 			T	newInstance(Object... initargs)
				Uses the constructor represented by this Constructor object to create and initialize a new instance of the constructor's declaring class, with the specified initialization parameters.
 * 					
 * 					Class AccessibleObject
 *			void	setAccessible(boolean flag)
					Set the accessible flag for this object to the indicated boolean value.
 */


public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		
		Class c = Class.forName("cn.itcast_01.Person");
		
//		Constructor [] cons = c.getConstructors();
//		for(Constructor con : cons){
//			System.out.println(con);
//		}
		
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		System.out.println(obj);
	
		
		
		
		
	}

}
