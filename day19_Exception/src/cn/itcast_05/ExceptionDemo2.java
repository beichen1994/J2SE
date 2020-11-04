package cn.itcast_05;
/**
 *  	throw :如果出现异常情况，我们可以把异常抛出，这个时候抛出时异常对象
 *  	
 *  	throws 和 throw 的区别：
 *  		throws：
 *  			在方法声明后面，表示出现异常的一种可能性
 *  		throw：
 *  			用在方法体内，一定抛出了某种异常
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
