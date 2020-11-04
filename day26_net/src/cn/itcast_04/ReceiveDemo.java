package cn.itcast_04;

import java.io.IOException;
import java.net.*;


public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(10086);
		
		while(true){
			byte[]b = new byte[1024];
			int len = b.length;
			DatagramPacket dp = new DatagramPacket(b,len);
			ds.receive(dp);
			
			byte[]b2= dp.getData();
			int len2 = dp.getLength();
			String s = new String(b2,0,len2);
			
			InetAddress address = dp.getAddress();
			String ip = address.getHostAddress();  
			
			System.out.println(ip + "" + s);
		}
		
		//让接收端一直开着，等待发送端
	}

}
