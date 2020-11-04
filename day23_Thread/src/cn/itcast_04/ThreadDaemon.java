package cn.itcast_04;
/*
 * 			Class Thread
 * 	void	setDaemon(boolean on)
					Marks this thread as either a daemon thread or a user thread.
					
 *   将该线程标记为守护线程
 *   当正在运行的线程都是守护线程，Java虚拟机退出，该方法必须在启动线程前调用
 */
public class ThreadDaemon extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x = 0; x<10;x++){
			System.out.println(getName() + ":" + x);	
		}	
	}
}
