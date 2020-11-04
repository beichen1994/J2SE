package cn.itcast_06;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP  （先开服务器端，才能连接成功）
 * A:创建发送端的socket对象  
 * B:获取输入流，写数据
 * C:释放资源
 */

/**
 *    Class Socket
 * 	 Socket(InetAddress address, int port)
     Creates a stream socket and connects it to the specified port number at the specified IP address.
     Socket(String host, int port)
     Creates a stream socket and connects it to the specified port number on the named host
     
     OutputStream	getOutputStream()
                    Returns an output stream for this socket.
      InputStream   getInputStream()
                    Returns an input stream for this socket.
 *
 */


/**
 *   Class String
 *   byte[]	   getBytes()
               Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
 *
 */
public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("59.78.156.161",8888);
		
		OutputStream os = s.getOutputStream();
		os.write("helloTCP".getBytes());
		
		s.close();
		
	}

}
