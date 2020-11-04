package cn.itcast_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("",9999);
		
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		
		br.close();
		s.close();
		
		
	}

}
