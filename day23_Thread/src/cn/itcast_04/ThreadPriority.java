package cn.itcast_04;

/**
 * 			Class Thread
	int	 getPriority()
		 Returns this thread's priority.	
		  默认优先级为5
		
	void setPriority(int newPriority)
		 Changes the priority of this thread.
		 1-10
 *
 */
public class ThreadPriority extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x<10;x++){
			System.out.println(getName() + "-" + x);
		}
	}

}
