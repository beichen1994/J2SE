package cn.itcast_04;
/**
 * 		Class BufferedReader
 *   BufferedReader(Reader in)
     Creates a buffering character-input stream that uses a default-sized input buffer.

 *   String readLine()
            Reads a line of text. 
 */


import java.io.IOException;
import java.net.*;
import java.io.*;

public class SendDemo {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		
		//键盘录入数据
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		String line = null;
		while ((line = br.readLine()) != null ){
			
//			byte[] b = line.getBytes();
//			int length = b.length;
//			InetAddress address = InetAddress.getByName("59.78.156.120");     
//			int port = 10086;
//			DatagramPacket dp = new DatagramPacket(b, length, address, port);
			
			
			DatagramPacket dp = new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("59.78.156.120"), 10086);
			ds.send(dp);
			
			if("886".equals(line)){   //键盘录入数据自己控制
				break;
			}
			
			
			
		}
		
		
		
		
		ds.close();
		
		
		
	}

}

