package cn.itcast_03;

/**
 * 	 	==
 * 			�������ͣ��Ƚ�ֵ
 * 			�������ͣ��Ƚϵ�ַ
 * 
 * 				Class Object
 * 			boolean	equals(Object obj){
 * 				return(this == obj); 
 * 			}
			Indicates whether some other object is "equal to" this one.			
			���ȽϵĻ��ǵ�ֵַ��������Ҫ��д		
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
//		Student s =(Student)obj; //Ҫʹ��ѧ��������г�Ա��������obj����ת��ΪStudent��
//		
//		if(this.name.equals(s.name) && this.age == s.age){     // ���õ�String���equals();
//			return true;
//			
//		}else{
//			return false;
//		}
	
	public boolean equals(Object obj){
		if(this == obj){            //�������Ķ���ͱ��������
			return true;
		}
		if(!(obj instanceof Student)){    //�������Ķ�����Student ��
			return false;
		}
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age == s.age;
	}
		
	//��ֱ���Զ�������д����
}
