package cn.itcast_04;

public class ThreadInterruptDemo {
	public static void main(String[] args) {
		ThreadInterrupt tt = new ThreadInterrupt();
		tt.setName("COCO");
		tt.start();
		
		//�㳬��3s���ѹ������Ҿ͸�����
		try {
			Thread.sleep(3000);
			//tt.stop();
			tt.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
