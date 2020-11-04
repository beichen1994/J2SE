package cn.itcast_06;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *   TCP
 *   A:创建接收端socket对象
 *   B:监听客户端连接，返回一个socket对象
 *   C:获取输入流，读取数据显示在控制台
 *   D:释放连接
 * 
 *
 */

/**    
 *         Class ServerSocket
 *   		    ServerSocket()
      			Creates an unbound server socket.
 *    			ServerSocket(int port)
      			Creates a server socket, bound to the specified port.
 *       Socket accept()
                Listens for a connection to be made to this socket and accepts it.
 *		 InetAddress getInetAddress()
                     Returns the local address of this server socket.
 */



/**
 *      	Class String
 *         String()
           Initializes a newly created String object so that it represents an empty character sequence.
           String(byte[] bytes)
           Constructs a new String by decoding the specified array of bytes using the platform's default charset.
           String(byte[] bytes, Charset charset)
           Constructs a new String by decoding the specified array of bytes using the specified charset.
 * 		   String(byte[] bytes, int offset, int length)
           Constructs a new String by decoding the specified subarray of bytes using the platform's default charset.     
 * 
 *
 */

public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();  
		InputStream is = s.getInputStream();
		
		byte[] bys = new byte[1024];
		int len = is.read(bys);   //一次读取一个字节
		String str = new String(bys,0,len);
		
		String ip = ss.getInetAddress().getHostAddress();  //获取IP地址
		
		System.out.println(ip + "" + str);
		
		s.close();
		//ss不关闭
		
		
		
		
	}

}
