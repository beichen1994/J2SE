package cn.itcast_06;
/*
 * 某电影院正在上映贺岁大片，共有100张票，而它有3个购票窗口，设计程序完成卖票
 */
public class SellTicketDemo {
	public static void main(String[] args) {
		
		SellTicket st1 = new SellTicket();
		SellTicket st2 = new SellTicket();
		SellTicket st3 = new  SellTicket();
		
		st1.setName("窗口1");
		st2.setName("窗口2");
		st3.setName("窗口3");
		
		st1.start();
		st2.start();
		st3.start();
	}

}
