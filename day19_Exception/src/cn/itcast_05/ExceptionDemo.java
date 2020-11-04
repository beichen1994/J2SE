package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *   throws 异常类名
 *  
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			method();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}
	 
	//在方法声明上抛出，是为了告诉调用者，你注意了，我有问题
	public static void method() throws ParseException{
		String s = "2017-10-27";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD  HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}

}
