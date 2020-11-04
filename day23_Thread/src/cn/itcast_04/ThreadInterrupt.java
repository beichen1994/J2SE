package cn.itcast_04;

import java.util.Date;

/*			Class Thread
 * 		void	interrupt()
				Interrupts this thread.
 * �ж��߳�,�׳�InterruptException�쳣��run()
 * ��������ִ��
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
		
		System.out.println("��ʼִ��"+ new Date());
		//��Ҫ��Ϣ10s����Ҫ������
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			System.out.println("�̱߳���ֹ��");
		}
		System.out.println("����ִ��" + new Date());
	}

}
