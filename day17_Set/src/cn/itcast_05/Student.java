package cn.itcast_05;


/**
 * 			Interface Comparable<T>
 * 		
 * 		int	compareTo(T o)
			Compares this object with the specified object for order.
 */

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(){
		super();   //应该是调用object的构造方法
	}
	
	public Student(String name,int age){
		super();
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
	
	public void setAge(){
		this.age =age;
	}

	@Override
	public int compareTo(Student s) {
		//return 1;
		//return 0;
		//return -1;
		
		//按照年龄排序
		
		int num = this.age - s.age;
		
		//如果年龄相同，比较姓名
		if(num ==0){
			return this.name.compareTo(s.name);
		}else{
			return num;
		}
		
	
	
	}
	
	


}
