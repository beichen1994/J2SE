package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 					Class InetAddress
 * 		static InetAddress	getByName(String host)    //根据主机名或ip地址的字符串得到Ip地址对象
							Determines the IP address of a host, given the host's name.
							
					String	getHostAddress()
							Returns the IP address string in textual presentation.
							
					String	getHostName()
							Gets the host name for this IP address.
							
					String	toString()
							Converts this IP address to a String.
							
		一个类中没有构造方法
				成员全部是静态的(Math,Arrays,Collection)
				单例设计模式(Runtime)
				类中有静态方法返回该类的对象
					Class Demo{
						private Demo(){
						
						}
						
						public static Demo getXXX(){
							return new Demo();
						}
						
					}
 *
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress add = InetAddress.getByName("wangyuqi");
		InetAddress add = InetAddress.getByName("59.78.156.120");
		
		
		String ip = add.getHostAddress();
		String ho = add.getHostName();
		System.out.println(ho + "-----" + ip);
	}

}
