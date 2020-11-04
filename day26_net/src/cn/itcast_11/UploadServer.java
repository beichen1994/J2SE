package cn.itcast_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// �ͻ��˶�ȡ�ı��ļ�����������д�뵽�ı��ļ�

public class UploadServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss =new ServerSocket(9999);
		Socket s   = ss.accept();
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		String line = null;
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		s.close();
		
	}

}
