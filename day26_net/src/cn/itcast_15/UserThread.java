package cn.itcast_15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UserThread implements Runnable {

	private Socket s;
	
	public UserThread(Socket s){
		this.s = s;
	}
	
	public void run() {
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String newName = System.currentTimeMillis() + ".txt";
			BufferedWriter bw = new BufferedWriter(new FileWriter(newName));   //防止命名冲突
			
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
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
