package cn.itcast_05;
/*
 * 多线程
 * 
 * 	  实现Runnable接口
 * 		A:自定义类MyRunnable实现Runnable接口
 * 		B:重写run（）方法
 * 		C:创建实例
 * 		D:创建Thread类的对象，并把实例作为构造参数传递
 */

//   tip:   继承Thread,创建对象，调用start();
//			实现Runnable，创建对象，创建Thread对象，调用start();
//			实现Runnable接口相比继承Thread类可以避免继承的局限，一个类可以继承多个接口，适合于资源的共享


public class MyRunnableDemo {
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		
		t1.setName("老虎");
		t2.setName("狮子");
		
		t1.start();
		t2.start();
	}

}
