package cn.itcast_04;
/*
 * 			Class Thread
 * 	void	setDaemon(boolean on)
					Marks this thread as either a daemon thread or a user thread.
					
 *   �����̱߳��Ϊ�ػ��߳�
 *   ���������е��̶߳����ػ��̣߳�Java������˳����÷��������������߳�ǰ����
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
