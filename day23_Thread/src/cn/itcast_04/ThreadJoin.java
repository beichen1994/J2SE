package cn.itcast_04;

/*
 * 				Class Thread
 *	  void  join(long millis)
			Waits at most millis milliseconds for this thread to die.
 * 
 */	

public class ThreadJoin extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x<10;x++){
			System.out.println(getName() + " :" + x);	
		}	
	}
}
