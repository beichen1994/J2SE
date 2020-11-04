package cn.itcast_09;

/*
 * 如何解决线程安全问题
 * 
 * A：是否有多线程环境
 * B：是否有共享数据
 * C：是否有多条语句操作共享数据
 * 
 * 我们的程序：
 * A：是否有多线程环境：是
 * B：是否有共享数据  是
 * C：是否有多条语句操作共享数据 是
 * 
 * A和B的问题我们改变不了，改变C
 * 思想：
 * 		把多条语句操作共享数据的代码包成一个整体，让某个线程执行时，别人不能来执行
 * ：
 * 		synchronized（对象）{
 * 			需要同步的代码	
 * }
 * 
 * 注意：
 *    同步可以解决安全问题的根本原因就在那个对象上，该对象如同锁的功能
 *    多个线程必须用一把锁
*/

public class SellTickets implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();
	@Override
	public void run() {
		
		while(true){
			synchronized(obj){
			 if(tickets>0){
			
				 try {
					Thread.sleep(100);  
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				 
				 
				 
				System.out.println(Thread.currentThread().getName() + "正在出售第"+(tickets --)+"张票");
				
			 
			 }
		  }
		}
	}

}
