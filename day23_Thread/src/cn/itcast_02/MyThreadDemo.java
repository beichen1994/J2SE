package cn.itcast_02;

/**
 * 
 * 实现多线程
 * 
 *  	
 *      继承Thread类
 *  	
 *  		A：自定义类MyThread 继承Thread类
 *  		B： MyThread类重写run（）；
 *  			不是类中所有方法都需要被线程执行，Thread类中run（）用来包含需要被线程执行的代码
 *  		C：创建对象
 * 			D：启动线程
 *
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		//MyThread mt = new MyThread();
		//mt.run();
		//mt.start();
		//run（）： 仅仅是封装被线程执行的代码，直接调用时是普通方法	
		//start（）：首先启动了线程，然后再由jvm调用线程的run（）方法
		
		//MyThread mt = new MyThread();
		//mt.start();
		//mt.start();
		//IllegalThreadStateException
		//为什么呢？这个相当于MyThread被调用了两次，而不是两个线程启动
		
	
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.start();
		mt2.start();
		
	}

}
