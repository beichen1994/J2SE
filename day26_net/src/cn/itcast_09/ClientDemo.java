package cn.itcast_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//�ͻ��˼���¼�룬��������������ı��ļ�

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.255.195",9999);
		
		BufferedReader  br = new BufferedReader( new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new  OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine()) != null){

			while("over".equals(line)){   //����¼����Ҫ����
				break;
				
			}	
			
			bw.write(line);
			bw.newLine();
			bw.flush();
			
			
		}
		
	}

}
