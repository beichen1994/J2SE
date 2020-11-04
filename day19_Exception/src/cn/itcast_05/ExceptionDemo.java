package cn.itcast_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *   throws �쳣����
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
	 
	//�ڷ����������׳�����Ϊ�˸��ߵ����ߣ���ע���ˣ���������
	public static void method() throws ParseException{
		String s = "2017-10-27";
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD  HH:mm:ss");
		Date d = sdf.parse(s);
		System.out.println(d);
	}

}
