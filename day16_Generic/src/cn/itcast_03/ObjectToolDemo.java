package cn.itcast_03;

//���ڵ�ʱ��������Object���������������

public class ObjectToolDemo {
	public static void main(String[] args) {
		
		ObjectTool ot = new ObjectTool();
		
		ot.setObj(new Integer(25));
		Integer i = (Integer)ot.getObj();
		System.out.println(i);
		
		ot.setObj(new String("Kate"));
		String s = (String)ot.getObj();
		System.out.println(s);
		
		System.out.println("-------------");
		
		
		ot.setObj(new Integer(30));
		String s2 = (String)ot.getObj();      //ClassCastException    ����ת��û�����⣬����ת�ͳ�����
  		System.out.println(s2);
		
	}
}
