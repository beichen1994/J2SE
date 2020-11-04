package cn.itcast_05;

/**
 * 				Interface Runnable
 * 			void	run()
					When an object implementing interface Runnable is used to create a thread, starting the thread causes the object's run method to be called in that separately executing thread.
 *
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100 ;i++){
			
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
