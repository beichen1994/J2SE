package cn.itcast_04;

import java.util.Date;

/*			Class Thread
 * 		void	interrupt()
				Interrupts this thread.
 * 中断线程,抛出InterruptException异常，run()
 * 方法继续执行
 */
/**
 * 			Class Date
 * 		Date()
		Allocates a Date object and initializes it so that it represents the time at which it was allocated, measured to the nearest millisecond.
		
		Date(long date)
		Allocates a Date object and initializes it to represent the specified number of milliseconds since the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.
 *
 */
public class ThreadInterrupt extends Thread {
	@Override
	public void run() {
		
		System.out.println("开始执行"+ new Date());
		//我要休息10s，不要打扰我
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			System.out.println("线程被终止了");
		}
		System.out.println("结束执行" + new Date());
	}

}
