package cn.itcast_01;

/**
 * 		有3个学生的信息，把这3个学生的信息存储到数组中，并遍历。
 *
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student [] stu = new Student[3];
		
		Student s1 = new Student("小明",5);
		Student s2 = new Student("小红",6);
		Student s3 = new Student("小亮",7);
		
		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;
		
		for(int i = 0; i < stu.length; i++){
			//System.out.println(stu[i]);
			Student st = stu[i];  // stu[] 是Student型
			
			System.out.println(st.getName() + "----" + st.getAge());
			
		}
		
	}
	
	

}
