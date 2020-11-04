package cn.itcast_08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

////	�ͻ��˼���¼�룬�������˿���̨���

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.255.195",9999);
		
		//����¼������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//��װͨ���ڵ���
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(s.getOutputStream()) );
		
		String line = null;
		while((line = br.readLine())  != null){
			if("886".equals(line)){         //����¼����Ҫ����
				break;
			}
			
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		
		br.close();
		s.close();
		
	}

}
