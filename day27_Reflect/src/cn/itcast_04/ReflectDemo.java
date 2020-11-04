package cn.itcast_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 					Class Class
 * 			
		Method[]	getMethods()
					Returns an array containing Method objects reflecting all the public methods of the class or interface represented by this Class object, including those declared by the class or interface and those inherited from superclasses and superinterfaces.
 *
 *		Method[]	getDeclaredMethods()
					Returns an array containing Method objects reflecting all the declared methods of the class or interface represented by this Class object, including public, protected, default (package) access, and private methods, but excluding inherited methods.
 *
 *		Method	  getMethod(String name, Class<?>... parameterTypes)
				  Returns a Method object that reflects the specified public member method of the class or interface represented by this Class object.
 *
 	   	Method 	  getDeclaredMethod(String name, Class<?>... parameterTypes)
				  Returns a Method object that reflects the specified declared method of the class or interface represented by this Class object.

 */

/**
 * 					Class Method
 * 		Object	invoke(Object obj, Object... args)
				Invokes the underlying method represented by this Method object, on the specified object with the specified parameters.
 *
 */

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("cn.itcast_01.Person");
		
		/**
		Method [] methods = c.getMethods();
		Method [] methods = c.getDeclaredMethods();
		for(Method me : methods){
			System.out.println(me);
		}
		*/
		
		Constructor con  = c.getConstructor();
		Object obj = con.newInstance();
		
		Method m1 = c.getMethod("show");
		m1.invoke(obj);
		System.out.println("--------------------------");
		
		
		Method m2 = c.getMethod("Ka", String.class);
		m2.invoke(obj,"hello");
		System.out.println("-------------------------");
		
	    Method m3 = c.getMethod("getString", String.class,int.class);
		Object objStr = m3.invoke(obj,"hello",100);
		System.out.println(objStr);
		System.out.println("------------------------------");
		
		Method m4 = c.getDeclaredMethod("function");
		m4.setAccessible(true);
		m4.invoke(obj);
		
		
	}

}
