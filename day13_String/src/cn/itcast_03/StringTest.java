package cn.itcast_03;

import java.util.Scanner;

//ģ���½�������λ���
public class StringTest {
	public static void main(String[] args) {
		String admin = "admin";
		String password = "admin";
		
		for(int i = 0 ; i< 3 ;i++){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���");
		String ad = sc.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("����������");
		String pw = sc2.nextLine(); 
		
		
		if(ad.equals(admin) && pw.equals(password)){
			System.out.println("��½�ɹ�");
			break;
		}else{
			if((2-i)==0){
				System.out.println("�����˺ű�����");
			}else{
			System.out.println("��¼ʧ��,�����У�" + (2-i) +"�λ���");
			}
		}
		
		
		
		}
	}

}
