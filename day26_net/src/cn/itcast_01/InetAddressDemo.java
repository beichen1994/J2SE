package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 					Class InetAddress
 * 		static InetAddress	getByName(String host)    //������������ip��ַ���ַ����õ�Ip��ַ����
							Determines the IP address of a host, given the host's name.
							
					String	getHostAddress()
							Returns the IP address string in textual presentation.
							
					String	getHostName()
							Gets the host name for this IP address.
							
					String	toString()
							Converts this IP address to a String.
							
		һ������û�й��췽��
				��Աȫ���Ǿ�̬��(Math,Arrays,Collection)
				�������ģʽ(Runtime)
				�����о�̬�������ظ���Ķ���
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
