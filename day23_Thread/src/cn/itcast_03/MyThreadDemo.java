package cn.itcast_03;


public class MyThreadDemo {
	public static void main(String[] args) {
		
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		my1.setName("王祖贤");
		my2.setName("张国荣");

		my1.start();
		my2.start();
		
		
		//带参构造方法给线程起名
	   //MyThread  my1 = new MyThread("王祖贤");
      //MyThread  my2 = new MyThread("张国荣");
		//my1.start();
		//my2.start();
		
		
		System.out.println(Thread.currentThread().getName());
	}

}

