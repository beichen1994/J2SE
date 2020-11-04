package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo2 {
public static void main(String[] args) throws IOException{  
		
		//InputStreamReader isr = new InputStreamReader( new FileInputStream("isr.txt"));
		
		InputStreamReader isr = new InputStreamReader( new FileInputStream("isr.txt") , "GBK");
		
		char[] ch = new char[1024];
		int len = 0;
		while((len = isr.read(ch))!= -1){                  //一次读取一个字符数组
			System.out.println(new String(ch,0,len));	
		}
		
		isr.close();
	}
}
