package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.pojo.User;

public class UserTest {
	public static void main(String[] args) {
		
	while(true){
		System.out.println("------------��ӭ����----------");
		System.out.println("1��½");
		System.out.println("2ע��");
		System.out.println("3�˳�");
		System.out.println("���������ѡ��");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();  //Ϊ�˷��������Ϣ��¼�룬ȫ���ַ�������
		
		
		UserDao ud = new UserDaoImpl();  

	
		switch(choice){
		case"1":
			System.out.println("------------��½����---------------");
			System.out.println("�������û���");
			String username  = sc.nextLine();
			System.out.println("����������");
			String password = sc.nextLine();
			
			//���õ�½����
			boolean f = ud.isLogin(username, password);
			if(f == true){
				System.out.println("��½�ɹ�");
				System.exit(-1);
				
			}else{
				System.out.println("�û������������󣬵�½ʧ��");
			}
			break;
		
			
		case "2":
			System.out.println("-------ע�����------------");
			System.out.println("�������û���");
			String newUsername  = sc.nextLine();
			System.out.println("����������");
			String newPassword = sc.nextLine();
			
			User us = new User();
			us.setUsername(newUsername);
			us.setPassword(newPassword);
			
			
			
			//����ע�Ṧ��
		
			ud.regist(us);
			System.out.println("ע��ɹ�");
		
			break;
		case"3":
		default:
			System.out.println("ллʹ�ã���ӭ�´�����");
			System.exit(-1);
			break;
			
		
		}
		
		}
		
		
	}

}
