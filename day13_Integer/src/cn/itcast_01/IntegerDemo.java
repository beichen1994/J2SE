package cn.itcast_01;
/**
 *				°ü×°Àà
 *		byte  		Byte
 *		int   		Integer
 *		double 		Double
 *		float		Float
 *		char		Charcter
 *		boolean		Boolean
 *
 *					Class Integer
 *		Integer(int value)
		Constructs a newly allocated Integer object that represents the specified int value.
		
		Integer(String s)
		Constructs a newly allocated Integer object that represents the int value indicated by the String parameter.	
				
		
 */
public class IntegerDemo {
	
		public static void main(String[] args) {
			
		
			
			int i =100;
			Integer in = new Integer(i);
			System.out.println("in: " + in);
			
			String s = "100";
			Integer inn = new Integer(s);
			System.out.println("inn : " + inn);
			
		}

}
