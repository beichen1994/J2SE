package cn.itcast_06;

public class SellTicket extends Thread {
	// ����100��Ʊ
	//private int tickets = 100;
	//Ϊ���ö���̹߳�����100��Ʊ��Ӧ���þ�̬����
	public static int tickets = 100;
	@Override
	public void run() {
		// ����100��Ʊ
		//ÿ���߳̽������������ÿ���̶߳����൱���������Լ�����100��Ʊ��������
		//int tickets = 100;
		
		while(true){
		if(tickets >0){
			System.out.println(getName() + "���ڳ��۵�"+(tickets--)+"��Ʊ");
		 }
		}
	}
}
