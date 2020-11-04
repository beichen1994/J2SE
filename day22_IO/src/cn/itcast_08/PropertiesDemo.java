package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/**
 * 			class Properties	extends Hashtable<Object,Object>
 *				The Properties can be saved to a stream or loaded from a stream. Each key and its corresponding value in the property list is a string.
 *
 *			 Properties()
			 Creates an empty property list with no default values.
 
 *			 Properties(Properties defaults)
			 Creates an empty property list with the specified defaults.
 *
 *			 
 */

public class PropertiesDemo {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		prop.put("it001", "hello");
		prop.put("it001", "world");
		prop.put("it003","java");
		
		Set<Object > set = prop.keySet();
		for(Object key : set){
			Object value = prop.get(key);
			System.out.println(key + "---" + value);
		}
		
	}

}
