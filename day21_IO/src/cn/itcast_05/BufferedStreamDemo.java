package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 			Class BufferedWriter
 * 		void	newLine()
				Writes a line separator.
 * 		
 * 			Class BufferedReader
 * 		String	readLine()
				Reads a line of text.
 *
 */
public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		write();
		//read();
	}
	
	

	private static void read() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("br2.txt"));	
		String line = null;
		
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		
		br.close();
		
	}

	
	private static void write() throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
		
		for(int i = 0; i < 10; i++){
			bw.write("Hello"+ i);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
			
			
		}
		
}

