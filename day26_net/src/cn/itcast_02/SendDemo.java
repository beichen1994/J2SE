package cn.itcast_02;

import java.io.IOException;
import java.net.*;



/**
 *    Class DatagramSocket
 *    
 *    		 DatagramSocket()
             Constructs a datagram socket and binds it to any available port on the local host machine		
 *    
 *           DatagramSocket(int port)
 *           Constructs a datagram socket and binds it to the specified port on the local host machine.
 *           
 *      void	send(DatagramPacket p)
                Sends a datagram packet from this socket.
                
 *      void    receive(DatagramPacket p)
 *              Receives a datagram packet from this socket.
 *  
 */

/**  Class DatagramPacket
 * 				DatagramPacket(byte[] buf, int length, InetAddress address, int port)
				Constructs a datagram packet for sending packets of length length to the specified port number on the specified host.
			
				DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port)
				Constructs a datagram packet for sending packets of length length with offset ioffsetto the specified port number on the specified host
 * 
 * 
 *   InetAddress  getAddress()
                  Returns the IP address of the machine to which this datagram is being sent or from which the datagram was received
        
     byte[]	      getData()
                  Returns the data buffer
            
     int	      getLength()
                  Returns the length of the data to be sent or the length of the data received.
 */

/** 
 * UDP（User Datagram Protocol）用户数据报协议  
 *   A: 创建socket对象
 *   B：创建数据，并把数据打包
 *   C：调用socket对象的发送方法
 *   D： 释放资源
 *  
 */
public class SendDemo {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		
		
		byte[] b = "Hello".getBytes();
		int length = b.length;
		InetAddress address = InetAddress.getByName("59.78.156.161");     
		int port = 10086;
		DatagramPacket dp = new DatagramPacket(b, length, address, port);
		
		ds.send(dp);
		
		
		
		ds.close();
		
		
		
	}

}
