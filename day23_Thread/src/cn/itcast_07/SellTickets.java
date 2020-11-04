package cn.itcast_07;

public class SellTickets implements Runnable {
	private int tickets = 100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			 if(tickets>0){
				System.out.println(Thread.currentThread().getName() + "正在出售第"+(tickets --)+"张票");
			}
		}
	}

}
