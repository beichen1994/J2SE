package cn.itcast_03;

import java.io.File;

/**
 *  ɾ�����ܣ�
 *  boolean	delete()
			Deletes the file or directory denoted by this abstract pathname.
	
	java�е�ɾ�����߻���վ
	ֻ����ɾ��
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		
		File f1 = new File("c:\\jfile\\aaa\\1.txt");
		System.out.println("ɾ��1.txt�ļ�"+f1.delete());
		
		File f2 = new File("C:\\jfile\\bbb\\ok");
		System.out.println("ɾ��ok�ļ���"+ f2.delete());
		
		File f3 = new File("C:\\jfile\\bbb");
		System.out.println("ɾ��bbb�ļ���" + f3.delete());
		
	}

}
