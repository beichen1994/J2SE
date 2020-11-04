package cn.itcast_06;

public class SellTicket extends Thread {
	// 定义100张票
	//private int tickets = 100;
	//为了让多个线程共享这100张票，应该用静态修饰
	public static int tickets = 100;
	@Override
	public void run() {
		// 定义100张票
		//每个线程进来都会走这里，每个线程对象相当于卖的是自己的那100张票，不合理
		//int tickets = 100;
		
		while(true){
		if(tickets >0){
			System.out.println(getName() + "正在出售第"+(tickets--)+"张票");
		 }
		}
	}
}
