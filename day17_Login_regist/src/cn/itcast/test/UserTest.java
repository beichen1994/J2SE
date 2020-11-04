package cn.itcast.test;

import java.util.Scanner;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.pojo.User;

public class UserTest {
	public static void main(String[] args) {
		
	while(true){
		System.out.println("------------欢迎光临----------");
		System.out.println("1登陆");
		System.out.println("2注册");
		System.out.println("3退出");
		System.out.println("请输入你的选择");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();  //为了方便后面信息的录入，全用字符串接收
		
		
		UserDao ud = new UserDaoImpl();  

	
		switch(choice){
		case"1":
			System.out.println("------------登陆界面---------------");
			System.out.println("请输入用户名");
			String username  = sc.nextLine();
			System.out.println("请输入密码");
			String password = sc.nextLine();
			
			//调用登陆功能
			boolean f = ud.isLogin(username, password);
			if(f == true){
				System.out.println("登陆成功");
				System.exit(-1);
				
			}else{
				System.out.println("用户名或密码有误，登陆失败");
			}
			break;
		
			
		case "2":
			System.out.println("-------注册界面------------");
			System.out.println("请输入用户名");
			String newUsername  = sc.nextLine();
			System.out.println("请输入密码");
			String newPassword = sc.nextLine();
			
			User us = new User();
			us.setUsername(newUsername);
			us.setPassword(newPassword);
			
			
			
			//调用注册功能
		
			ud.regist(us);
			System.out.println("注册成功");
		
			break;
		case"3":
		default:
			System.out.println("谢谢使用，欢迎下次再来");
			System.exit(-1);
			break;
			
		
		}
		
		}
		
		
	}

}
