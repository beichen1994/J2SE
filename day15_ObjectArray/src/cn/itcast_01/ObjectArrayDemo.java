package cn.itcast_01;

/**
 * 		��3��ѧ������Ϣ������3��ѧ������Ϣ�洢�������У���������
 *
 */
public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student [] stu = new Student[3];
		
		Student s1 = new Student("С��",5);
		Student s2 = new Student("С��",6);
		Student s3 = new Student("С��",7);
		
		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;
		
		for(int i = 0; i < stu.length; i++){
			//System.out.println(stu[i]);
			Student st = stu[i];  // stu[] ��Student��
			
			System.out.println(st.getName() + "----" + st.getAge());
			
		}
		
	}
	
	

}
