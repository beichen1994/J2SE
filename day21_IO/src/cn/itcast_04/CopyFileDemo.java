package cn.itcast_04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");
		FileWriter fw = new FileWriter("b.txt");
		
//		int b = 0;
//		while((b= fr.read()) != -1){
//			fw.write(b);
//		}
		
		char[] ch = new char[1024];
		int len = 0 ;
		while( (len = fr.read(ch) )!= -1){
			fw.write(ch,0,len);
		}
		
		
		
	}

}
