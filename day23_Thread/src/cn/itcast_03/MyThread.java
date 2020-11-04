package cn.itcast_03;
/**
 * 				Class Thread
 * 			Thread()
			Allocates a new Thread object.
			
			Thread(String name)
			Allocates a new Thread object.
			
			String	getName()
					Returns this thread's name.
			
			void	setName(String name)
					Changes the name of this thread to be equal to the argument name.
					
	static Thread	currentThread()
					Returns a reference to the currently executing thread object.
 *
 */

public class MyThread extends Thread {

	
	public MyThread(){
		
	}
	
	/*
	public MyThread(String name){
		super(name);
	}
	*/
	
	
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x <500; x++){
			System.out.println(getName()+"---"+x);
		}
	}
	
}
