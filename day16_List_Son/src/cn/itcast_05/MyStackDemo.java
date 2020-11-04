package cn.itcast_05;

//  MyStack≤‚ ‘


public class MyStackDemo {
	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		
		ms.add("hello");
		ms.add("world");
		ms.add("java");
		
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
		
	}

}
