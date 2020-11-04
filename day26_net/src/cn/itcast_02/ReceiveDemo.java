package cn.itcast_02;

import java.io.IOException;
import java.net.*;

/**
 * UDP
 * A:创建接收端socket
 * B：创建数据包(接收容器)
 * C：调用socket对象的接收方法
 * D：解析数据包
 *　E：释放资源
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(10086);
		
		
		byte[]b = new byte[1024];
		int len = b.length;
		DatagramPacket dp = new DatagramPacket(b,len);
		
		ds.receive(dp);
		
		InetAddress address = dp.getAddress();
		 String ip = address.getHostAddress();  
		
		byte[]b2= dp.getData();
		int len2 = dp.getLength();
		String s = new String(b2,0,len2);
		
		System.out.println(ip + "" + s);
		
		ds.close();
		
		
	}

}
