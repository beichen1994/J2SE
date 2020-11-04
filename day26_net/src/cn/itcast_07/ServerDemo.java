package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();   //阻塞住，等待客户端
		
		InputStream  is = s.getInputStream(); 
		byte[] by = new byte[1024];
		int len = is.read(by);  //阻塞
		
		String str = new String(by,0,len);
		System.out.println("Server端读到:"  + str);
		
		OutputStream os = s.getOutputStream();
		os.write("数据已经收到了".getBytes() );
		
		s.close();
		
	}
	
}
