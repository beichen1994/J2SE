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
 * 		加入反馈没反应
 * 		读取文本文件是以null作为结束信息，但是通道内不是这样来结束，所以服务器端不知道结束了
 * 		而客户端还在等待客户端反馈
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
		while((line = br.readLine()) != null){      //阻塞
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		s.shutdownOutput();
		
		//客户端接受反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = brClient.readLine();
		System.out.println("客户端接收到的反馈是:" + str);
		
		
		
	}

}
