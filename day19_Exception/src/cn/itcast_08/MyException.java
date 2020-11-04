package cn.itcast_08;
/**
 * 自定义异常：
 *  	继承自Exception
 *  	继承自RuntimeException
 *
 */
public class MyException extends Exception{
	
	MyException(){
		
	}
	
	MyException( String message){
		super(message);   // 调用父类Exception的构造方法
	}
	

}
