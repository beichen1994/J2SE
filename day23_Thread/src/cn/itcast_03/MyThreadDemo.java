package cn.itcast_03;


public class MyThreadDemo {
	public static void main(String[] args) {
		
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.setName("������");
		my2.setName("�Ź���");

		my1.start();
		my2.start();
		
		
		//���ι��췽�����߳�����
	   //MyThread  my1 = new MyThread("������");
      //MyThread  my2 = new MyThread("�Ź���");
		//my1.start();
		//my2.start();
		
		
		System.out.println(Thread.currentThread().getName());
	}

}

