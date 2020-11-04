package cn.itcast_02;

import java.util.Enumeration;
import java.util.Vector;

/**		
 * 					Class Vector
 * 		
 * 		添加：
 * 		void	addElement(E obj)
				Adds the specified component to the end of this vector, increasing its size by one.
		
		获取：
		E	elementAt(int index)
			Returns the component at the specified index.
		
		获取：
		Enumeration<E>	elements()
						Returns an enumeration of the components of this vector.
 *
 */

/**
 * 					Interface Enumeration
 * 
 * 			boolean	hasMoreElements()
					Tests if this enumeration contains more elements.
					
			E	nextElement()
				Returns the next element of this enumeration if this enumeration object has at least one more element to provide.
 *
 */

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		
		for(int i = 0; i < v.size(); i++){
			String s = (String)v.elementAt(i);
			System.out.println(s);
		}
		
		System.out.println("---------------------------------");
		
		
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			String s = (String)en.nextElement();
			System.out.println(s);
		}
		
		
		
	}

}
