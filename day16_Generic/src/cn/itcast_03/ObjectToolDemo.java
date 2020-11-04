package cn.itcast_03;

//早期的时候，我们用Object来代表任意的类型

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
		String s2 = (String)ot.getObj();      //ClassCastException    向上转型没有问题，向下转型出问题
  		System.out.println(s2);
		
	}
}
