package cn.itcast_04;

/**
 * 				Class Object
 * 		protected void	finalize()
						Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
					
		
	  	protected Object	clone()
							Creates and returns a copy of this object.
							
		//protected 类型，只能在子类中调用，所以要在子类中重写，才能在其他类中调用
 *
 */
/**
 * 			Interface Cloneable
 * 		标记接口
 * 		指示Object.clone()方法可以合法的对该类实例进行字段复制
 * 		
 * 		
 */

public class Student implements Cloneable {
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
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
