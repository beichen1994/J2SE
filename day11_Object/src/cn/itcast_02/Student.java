package cn.itcast_02;

/**
 * 			Class Object
 * 		String	toString()
				Returns a string representation of the object.
				getClass().getName() + '@' + Integer.toHexString(hashCode())
 */
/**
 *			Class Integer
 *		static String  toHexString(int i)
					   Returns a string representation of the integer argument as an unsigned integer in base 16
						
		String	toString()
				Returns a String object representing this Integer's value.
 *
 *		static int	parseInt(String s)
					Parses the string argument as a signed decimal integer.
 *
 */
public class Student {
	private String name;
	private int age;
	
	public Student(){
		super();
	}
	
	public Student(String name , int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(){
		this.age = age;
	}
	
	public String toString(){
		return("ĞÕÃû" + name + "ÄêÁä" + age);
	}

}
