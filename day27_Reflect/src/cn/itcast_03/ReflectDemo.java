package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//通过反射获取成员变量
/**
 * 					Class Class
 * 
 * 			Field[]	 getFields()
					 Returns an array containing Field objects reflecting all the accessible public fields of the class or interface represented by this Class object.
 * 			
 * 			Field[]	getDeclaredFields()
					Returns an array of Field objects reflecting all the fields declared by the class or interface represented by this Class object.

 *			Field	getField(String name)
					Returns a Field object that reflects the specified public member field of the class or interface represented by this Class object.

			Field	getDeclaredField(String name)
					Returns a Field object that reflects the specified declared field of the class or interface represented by this Class object.
 */	

/**
 *		 					Class Field		
 *			void	set(Object obj, Object value)
					Sets the field represented by this Field object on the specified object argument to the specified new value.	
 * 				
 */

public class ReflectDemo {
		public static void main(String[] args) throws Exception {
			
				Class c = Class.forName("cn.itcast_01.Person");
				
				
				/**
				Field [] f = c.getFields();
			    Field [] f = c.getDeclaredFields();
				for(Field fi  : f){
					System.out.println(fi);
				}
				*/
				
				
				Constructor con = c.getConstructor();
				Object obj = con.newInstance();
				System.out.println(obj);
				
				Field af =c.getField("address");
				af.set(obj, "北京");
				System.out.println(obj);
				
				Field nf = c.getDeclaredField("name");
				nf.setAccessible(true);
				nf.set(obj, "林青霞");
				System.out.println(obj);
				
				Field agef = c.getDeclaredField("age");
				agef.setAccessible(true);
				agef.set(obj, 12);
				System.out.println(obj);
				
		}

}
