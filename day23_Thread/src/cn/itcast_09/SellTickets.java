package cn.itcast_09;

/*
 * ��ν���̰߳�ȫ����
 * 
 * A���Ƿ��ж��̻߳���
 * B���Ƿ��й�������
 * C���Ƿ��ж�����������������
 * 
 * ���ǵĳ���
 * A���Ƿ��ж��̻߳�������
 * B���Ƿ��й�������  ��
 * C���Ƿ��ж����������������� ��
 * 
 * A��B���������Ǹı䲻�ˣ��ı�C
 * ˼�룺
 * 		�Ѷ����������������ݵĴ������һ�����壬��ĳ���߳�ִ��ʱ�����˲�����ִ��
 * ��
 * 		synchronized������{
 * 			��Ҫͬ���Ĵ���	
 * }
 * 
 * ע�⣺
 *    ͬ�����Խ����ȫ����ĸ���ԭ������Ǹ������ϣ��ö�����ͬ���Ĺ���
 *    ����̱߳�����һ����
*/

public class SellTickets implements Runnable {
	private int tickets = 100;
	private Object obj = new Object();
	@Override
	public void run() {
		
		while(true){
			synchronized(obj){
			 if(tickets>0){
			
				 try {
					Thread.sleep(100);  
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				 
				 
				 
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"+(tickets --)+"��Ʊ");
				
			 
			 }
		  }
		}
	}

}
