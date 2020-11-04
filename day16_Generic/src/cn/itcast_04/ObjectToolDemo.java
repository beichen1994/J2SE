package cn.itcast_04;

public class ObjectToolDemo {
	public static void main(String[] args) {
		
		ObjectTool<String> ot = new ObjectTool<String>();
		
		ot.setObj(new String("Kate"));
		String s = ot.getObj();
		System.out.println(s);
		
		
		ObjectTool<Integer> ot2 = new ObjectTool<Integer>();
		ot2.setObj(new Integer(32));
		Integer i = ot2.getObj();
		System.out.println(i);
		
	}

}
