package cn.itcast_07;

public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st = new SellTickets();
		Thread t1 = new Thread(st,"����1");
		Thread t2 = new Thread(st,"����2");
		Thread t3 = new Thread(st,"����3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
