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
		super();   //Ӧ���ǵ���object�Ĺ��췽��
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
		
		//������������
		
		int num = this.age - s.age;
		
		//���������ͬ���Ƚ�����
		if(num ==0){
			return this.name.compareTo(s.name);
		}else{
			return num;
		}
		
	
	
	}
	
	


}
