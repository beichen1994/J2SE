package cn.itcast_03;

/**
 * 	 	==
 * 			基本类型：比较值
 * 			引用类型：比较地址
 * 
 * 				Class Object
 * 			boolean	equals(Object obj){
 * 				return(this == obj); 
 * 			}
			Indicates whether some other object is "equal to" this one.			
			它比较的还是地址值，所以需要重写		
 */

/**
 *			  Class String
 *
 *		   public boolean equals(Object anObject) {
	if (this == anObject) {
	    return true;
	}
	if (anObject instanceof String) {
	    String anotherString = (String)anObject;
	    int n = count;
	    if (n == anotherString.count) {
		char v1[] = value;
		char v2[] = anotherString.value;
		int i = offset;
		int j = anotherString.offset;
		while (n-- != 0) {
		    if (v1[i++] != v2[j++])
			return false;
		}
		return true;
	    }
	}
	return false;
    }
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

//	public boolean equals(Object obj){
//		Student s =(Student)obj; //要使用学生类的特有成员变量，将obj向下转型为Student类
//		
//		if(this.name.equals(s.name) && this.age == s.age){     // 调用的String类的equals();
//			return true;
//			
//		}else{
//			return false;
//		}
	
	public boolean equals(Object obj){
		if(this == obj){            //如果传入的对象和本对象相等
			return true;
		}
		if(!(obj instanceof Student)){    //如果传入的对象不是Student 类
			return false;
		}
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age == s.age;
	}
		
	//或直接自动生成重写代码
}
