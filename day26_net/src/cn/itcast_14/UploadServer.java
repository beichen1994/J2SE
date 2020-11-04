package cn.itcast_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//多个客户端上传文件，一个服务器端接收文件

// while 循环，多个客户端共用单线程，进度缓慢

public class UploadServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(9999);
		
		while(true){
			
			Socket s = ss.accept();     // 阻塞
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
			
			String line = null;
			while((line = br.readLine()) != null){   //阻塞
				bw.write(line);
				bw.newLine();
				bw.flush();
				
			}
			
			//服务器给出反馈
			BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()) );
			bwServer.write("文件上传成功了");
			bwServer.newLine();
			bwServer.flush();
			
			
			bw.close();
			s.close();
		}
			
		}
	

}
