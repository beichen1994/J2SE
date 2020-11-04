package cn.itcast_08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/**		
 * 				class Properties				
 * 
 *			void	load(Reader reader)
					Reads a property list (key and element pairs) from the input character stream in a simple line-oriented forma
					���ļ��е����ݶ�ȡ�������У��ļ������ݱ����Ǽ�ֵ����ʽ
			
 *			void	store(Writer writer, String comments)
					Writes this property list (key and element pairs) in this Properties table to the output character stream in a format suitable for using the load(Reader) method.
 *					�Ѽ����е����ݴ洢���ļ�
 */

public class PropertiesDemo3 {
	public static void main(String[] args) throws Throwable {
		
		myStore();
	}
	private static void myStore() throws Throwable{
		Properties prop = new Properties();
		
		prop.setProperty("zhangsna", "27");
		prop.setProperty("wangwu", "23");
		prop.setProperty("gjd", "54");
		
		Writer w = new FileWriter("name.txt");
		prop.store(w, "helloworld");
		w.close();
	}
	
	
	private static void	myLoad() throws Exception{
		Properties prop = new Properties();
		Reader r = new FileReader("prop.txt");
		prop.load(r);
		r.close();
		
		System.out.println("prop" + prop);
	}

}
