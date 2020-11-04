package cn.itcast_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//客户端键盘录入，服务器端输出到文本文件

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.255.195",9999);
		
		BufferedReader  br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new  OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine()) != null){

			while("over".equals(line)){   //键盘录入需要结束
				break;
				
			}	
			
			bw.write(line);
			bw.newLine();
			bw.flush();
			
			
		}
		
	}

}
