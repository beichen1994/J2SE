package cn.itcast_04;

import java.util.Date;

/**
 * 			  Class Thread
 * static void	sleep(long millis)
				Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers
 */
public class ThreadSleep extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x<10;x++){
			System.out.println(getName() + "-" + x +"日期" + new Date());
			//睡眠
			//困了，我稍微休息1秒钟
			try {
				Thread.sleep(1000); //static 方法，类名+方法直接用
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
