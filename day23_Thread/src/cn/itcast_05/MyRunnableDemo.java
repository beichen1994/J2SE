package cn.itcast_05;
/*
 * ���߳�
 * 
 * 	  ʵ��Runnable�ӿ�
 * 		A:�Զ�����MyRunnableʵ��Runnable�ӿ�
 * 		B:��дrun��������
 * 		C:����ʵ��
 * 		D:����Thread��Ķ��󣬲���ʵ����Ϊ�����������
 */

//   tip:   �̳�Thread,�������󣬵���start();
//			ʵ��Runnable���������󣬴���Thread���󣬵���start();
//			ʵ��Runnable�ӿ���ȼ̳�Thread����Ա���̳еľ��ޣ�һ������Լ̳ж���ӿڣ��ʺ�����Դ�Ĺ���


public class MyRunnableDemo {
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		
		t1.setName("�ϻ�");
		t2.setName("ʨ��");
		
		t1.start();
		t2.start();
	}

}
