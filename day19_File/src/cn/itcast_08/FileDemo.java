package cn.itcast_08;

import java.io.File;

/**
 *  �ж�ĳĿ¼���Ƿ���.jpg���ļ�������������
 *  
 *  ������
 *  		��װĳĿ¼
 *  		��ȡ��Ŀ¼�������ļ����ļ�����
 *  		����File���飬�õ�ÿһ��File����
 *  		�ж��Ƿ����ļ�
 *  			�ǣ��Ƿ���.jpg
 *  				�ǣ�����ļ�����
 *  				�񣺲�����
 *  			�񣺲�����
 *
 */
/**
 * 	Class String
 * boolean	endsWith(String suffix)
			Tests if this string ends with the specified suffix.
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		File f  = new File("C:\\jfile");
		File[]arrfile = f.listFiles();
		for(File f2 : arrfile){
			if(f2.isFile()){
				if(f2.getName().endsWith("jpg")){
					System.out.println("�ļ�Ϊ��" + f2.getName());
				}
				
			}
		}
	}

}
