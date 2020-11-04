package cn.itcast_02;

/**
 * 				Class Thread
 * 			Thread()
			Allocates a new Thread object.
			
			Thread(String name)
			Allocates a new Thread object.
		
			Thread(Runnable target)
			Allocates a new Thread object.
			
			void	run()
					If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called; otherwise, this method does nothing and returns.
			
			void	start()
					Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
			
		static void	sleep(long millis)
					Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers
		
		   void	    setName(String name)
					Changes the name of this thread to be equal to the argument name.
					
			String	getName()
					Returns this thread's name.
					
		 int		getPriority()
					Returns this thread's priority.	
			
			void	setPriority(int newPriority)
					Changes the priority of this thread.			
		
	static Thread	currentThread()
					Returns a reference to the currently executing thread object.
					
			void	setDaemon(boolean on)
					Marks this thread as either a daemon thread or a user thread.	
				
		static void	yield()
					hint to the scheduler that the current thread is willing to yield its current use of a processor.
			
			void	join(long millis)
					Waits at most millis milliseconds for this thread to die.
				
			void	interrupt()
					Interrupts this thread.
					
	static boolean	interrupted()
					Tests whether the current thread has been interrupted.
					
			boolean	isAlive()
					Tests if this thread is alive.
					
			String	toString()
					Returns a string representation of this thread, including the thread's name, priority, and thread group.
					
		
 *
 */
public class MyThread extends Thread {
	
	public void run() {
	
		for(int i = 0 ; i < 500 ; i++ ){
			System.out.println(i);
		}
	}
	
	
	

}
