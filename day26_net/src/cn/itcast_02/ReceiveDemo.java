package cn.itcast_02;

import java.io.IOException;
import java.net.*;

/**
 * UDP
 * A:�������ն�socket
 * B���������ݰ�(��������)
 * C������socket����Ľ��շ���
 * D���������ݰ�
 *��E���ͷ���Դ
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
