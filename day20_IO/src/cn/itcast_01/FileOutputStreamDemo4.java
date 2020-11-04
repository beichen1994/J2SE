package cn.itcast_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//加入异常处理
public class FileOutputStreamDemo4 {
	public static void main(String[] args)  {
		
		
		FileOutputStream fos = null ;
		try {
			fos = new FileOutputStream("text4.txt");
			fos.write("java".getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(fos != null){
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
		
		
		
	}

}
