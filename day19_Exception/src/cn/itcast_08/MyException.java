package cn.itcast_08;
/**
 * �Զ����쳣��
 *  	�̳���Exception
 *  	�̳���RuntimeException
 *
 */
public class MyException extends Exception{
	
	MyException(){
		
	}
	
	MyException( String message){
		super(message);   // ���ø���Exception�Ĺ��췽��
	}
	

}
