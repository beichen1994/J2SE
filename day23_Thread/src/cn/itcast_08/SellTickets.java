package cn.itcast_08;

public class SellTickets implements Runnable {
	private int tickets = 100;
	@Override
	public void run() {
	
		while(true){
			 //t1,t2,t3�����߳�
			
			 if(tickets>0){
				 
				 try {
					Thread.sleep(100);  //t1��������Ϣ��t2��������Ϣ
				} catch (InterruptedException e) {
				
					e.printStackTrace();
				}
				 
				 
				 
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�"+(tickets --)+"��Ʊ");
				//����״̬��
				//����1���ڳ��۵�100��Ʊ
				//����2 ���ڳ��ѵ�99��Ʊ
				//����cpu��ÿһ��ִ�ж���ԭ���ԣ�������ģ�����
				//tickets--���ȼ�¼��ǰ��ֵ�����Ű�tickets--��Ȼ�������ǰ��ֵ��t2���ˣ�
				//ticket��ֵ�����99
				//����1 ���ڳ��۵�100��Ʊ
				//����2 ���ڳ��۵�100��Ʊ
			 
			 }
		}
	}

}
