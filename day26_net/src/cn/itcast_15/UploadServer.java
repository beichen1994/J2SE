package cn.itcast_15;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(9999);
		
		while(true){
			Socket s = ss.accept();
			UserThread ut = new UserThread(s);
			new Thread(ut).start();
		}
		
	}

}
