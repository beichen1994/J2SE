package cn.itcast_05;
/**
 *  	throw :��������쳣��������ǿ��԰��쳣�׳������ʱ���׳�ʱ�쳣����
 *  	
 *  	throws �� throw ������
 *  		throws��
 *  			�ڷ����������棬��ʾ�����쳣��һ�ֿ�����
 *  		throw��
 *  			���ڷ������ڣ�һ���׳���ĳ���쳣
 */
public class ExceptionDemo2 {
	public static void main(String[] args) {
		method();
	}
	public static void method(){
		int a = 10;
		int b = 0;
		if(b == 0){
			throw new ArithmeticException();
		}else{
			System.out.println(a/b);
		}
	}
	
}
