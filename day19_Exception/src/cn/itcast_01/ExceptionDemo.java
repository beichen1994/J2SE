package cn.itcast_01;
/**
 * �쳣��Throwable
 * 		�������⣺Error  (������)
 * 		���⣺ Exception
 * 			���������⣺RuntimeException  (����������ʱ���벻�Ͻ�)
 * 			���������⣺����RuntimeException���쳣(���봦���������޷�����)
 *
 *�����������⣬���ǲ�������jvm��Ĭ�ϴ���
 *���쳣�����ƣ�ԭ����ʾ�ڿ���̨
 *ͬʱ��������
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		System.out.println("over");
	}

}
