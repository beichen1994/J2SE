package cn.itcast_02;

/**
 * 
 * ʵ�ֶ��߳�
 * 
 *  	
 *      �̳�Thread��
 *  	
 *  		A���Զ�����MyThread �̳�Thread��
 *  		B�� MyThread����дrun������
 *  			�����������з�������Ҫ���߳�ִ�У�Thread����run��������������Ҫ���߳�ִ�еĴ���
 *  		C����������
 * 			D�������߳�
 *
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		//MyThread mt = new MyThread();
		//mt.run();
		//mt.start();
		//run������ �����Ƿ�װ���߳�ִ�еĴ��룬ֱ�ӵ���ʱ����ͨ����	
		//start�����������������̣߳�Ȼ������jvm�����̵߳�run��������
		
		//MyThread mt = new MyThread();
		//mt.start();
		//mt.start();
		//IllegalThreadStateException
		//Ϊʲô�أ�����൱��MyThread�����������Σ������������߳�����
		
	
		
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt1.start();
		mt2.start();
		
	}

}
