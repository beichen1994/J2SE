package cn.itcast_04;

public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		
		td1.setName("πÿ”");
		td2.setName("’≈∑…");
		
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();
		td2.start();
		
		Thread.currentThread().setName("¡ı±∏");
		for(int i = 0; i <5 ;i++){
			System.out.println(Thread.currentThread().getName()+":" + i);
		}
		
	}

}
