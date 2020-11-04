package cn.itcast_04;

/*
 * 			Class Thread 
 * 	 static void  yield()
			      hint to the scheduler that the current thread is willing to yield its current use of a processor.
 * 				线程礼让，
 * 				暂停当前线程对象，执行其它线程
 * 				不能保证一人一次
 */
public class ThreadYield extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x<10;x++){
			System.out.println(getName() + "-" + x);
			Thread.yield();
		}
	}

}
