package cn.itcast_12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 		���뷴��û��Ӧ
 * 		��ȡ�ı��ļ�����null��Ϊ������Ϣ������ͨ���ڲ������������������Է������˲�֪��������
 * 		���ͻ��˻��ڵȴ��ͻ��˷���
 * 		
 * 		
 * 			Class Socket 
 * 		
 * 		void	shutdownInput()
				Places the input stream for this socket at "end of stream".
				
		void	shutdownOutput()
				Disables the output stream for this socket.
 * 		
 * 
 */

public class UploadClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("",9999);
		
		BufferedReader br = new BufferedReader( new FileReader("a.txt"));
		BufferedWriter bw  = new BufferedWriter( new OutputStreamWriter(s.getOutputStream()) );
		
		String line = null;
		while((line = br.readLine()) != null){      //����
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		s.shutdownOutput();
		
		//�ͻ��˽��ܷ���
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = brClient.readLine();
		System.out.println("�ͻ��˽��յ��ķ�����:" + str);
		
		
		
	}

}
