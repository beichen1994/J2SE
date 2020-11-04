package cn.itcast_08;

public class SellTickets implements Runnable {
	private int tickets = 100;
	@Override
	public void run() {
	
		while(true){
			 //t1,t2,t3三个线程
			
			 if(tickets>0){
				 
				 try {
					Thread.sleep(100);  //t1就稍作休息，t2就稍作休息
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				 
				 
				 
				System.out.println(Thread.currentThread().getName() + "正在出售第"+(tickets --)+"张票");
				//理想状态：
				//窗口1正在出售第100张票
				//窗口2 正在出搜第99张票
				//但是cpu的每一次执行都是原子性（最基本的）操作
				//tickets--，先记录以前的值，接着把tickets--，然后输出以前的值（t2来了）
				//ticket的值变成了99
				//窗口1 正在出售第100张票
				//窗口2 正在出售第100张票
			 
			 }
		}
	}

}
