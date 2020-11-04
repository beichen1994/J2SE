package cn.itcast_02;

public class Student {
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
	
	

}
