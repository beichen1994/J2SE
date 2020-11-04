package cn.itcast_06;

public class InterDemo {
	public static void main(String[] args) {
		
		Inter<String> in = new InterImpl<String>();
		in.show("hello");
		
		Inter<Integer> in2 = new InterImpl<Integer>();
		in2.show(new Integer(23));
	}

}
