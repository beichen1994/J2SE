package cn.itcast_01;
/**
 * 异常：Throwable
 * 		严重问题：Error  (不处理)
 * 		问题： Exception
 * 			运行期问题：RuntimeException  (不处理，可能时代码不严谨)
 * 			编译期问题：不是RuntimeException的异常(必须处理，不处理无法编译)
 *
 *如果程序出问题，我们不做处理，jvm做默认处理
 *把异常的名称，原因显示在控制台
 *同时结束程序
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		System.out.println("over");
	}

}
