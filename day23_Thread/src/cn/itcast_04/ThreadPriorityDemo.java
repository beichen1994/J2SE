package cn.itcast_04;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		
		
		ThreadPriority tp1 = new ThreadPriority();
		ThreadPriority tp2 = new ThreadPriority();
		ThreadPriority tp3 = new ThreadPriority();
		
		tp1.setName("��������");
		tp2.setName("����Ⱥ");
		tp3.setName("��ƽ֮");
		
		
		
		 
		tp1.setPriority(9);
		tp1.setPriority(3);
		tp1.setPriority(7);
		
		
		tp1.start();
		tp2.start();
		tp3.start();
		
	}
}
