package cn.itcast_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//����ͻ����ϴ��ļ���һ���������˽����ļ�

// while ѭ��������ͻ��˹��õ��̣߳����Ȼ���

public class UploadServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(9999);
		
		while(true){
			
			Socket s = ss.accept();     // ����
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
			
			String line = null;
			while((line = br.readLine()) != null){   //����
				bw.write(line);
				bw.newLine();
				bw.flush();
				
			}
			
			//��������������
			BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()) );
			bwServer.write("�ļ��ϴ��ɹ���");
			bwServer.newLine();
			bwServer.flush();
			
			
			bw.close();
			s.close();
		}
			
		}
	

}
