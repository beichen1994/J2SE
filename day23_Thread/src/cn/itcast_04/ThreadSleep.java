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
			System.out.println(getName() + "-" + x +"����" + new Date());
			//˯��
			//���ˣ�����΢��Ϣ1����
			try {
				Thread.sleep(1000); //static ����������+����ֱ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
