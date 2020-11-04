package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/**
 * 				class Properties
 * 
 * 		String	getProperty(String key)
				Searches for the property with the specified key in this property lis
 * 
 * 		String	getProperty(String key, String defaultValue)
				Searches for the property with the specified key in this property list.
 *				获取元素		
 *
 *		Object	setProperty(String key, String value)
				Calls the Hashtable method put.
 				添加元素
 				
 *		Set<String>	stringPropertyNames()
					Returns a set of keys in this property list where the key and its corresponding value are strings, including distinct keys in the default property list if a key of the same name has not already been found from the main properties list.
 *					获取所有键的集合
 */

public class PropertiesDemo2 {
	
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("zhangsna", "30");
		prop.setProperty("lisi", "40");
		prop.setProperty("wangwu", "50");
		
		Set<String> se = prop.stringPropertyNames();
		for(String key : se){
			String value = prop.getProperty(key);
			System.out.println(key + "--" + value);
		}
	}

}
