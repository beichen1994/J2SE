package cn.itcast_07;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

// 服务器端给客户端反馈

public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s  = new Socket("192.168.255.195",9999);
		
		OutputStream os = s.getOutputStream();
		os.write("服务器你好吗？".getBytes());
		
		InputStream is = s.getInputStream();
		byte [] by = new byte[1024];
		int len = is.read(by);    // 阻塞住
		String str = new String(by,0,len);
		System.out.println("客户端读到:" + str);
		
	}

}
