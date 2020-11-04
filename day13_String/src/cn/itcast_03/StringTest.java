package cn.itcast_03;

import java.util.Scanner;

//模拟登陆，给三次机会
public class StringTest {
	public static void main(String[] args) {
		String admin = "admin";
		String password = "admin";
		
		for(int i = 0 ; i< 3 ;i++){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String ad = sc.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入密码");
		String pw = sc2.nextLine(); 
		
		
		if(ad.equals(admin) && pw.equals(password)){
			System.out.println("登陆成功");
			break;
		}else{
			if((2-i)==0){
				System.out.println("您的账号被锁定");
			}else{
			System.out.println("登录失败,您还有：" + (2-i) +"次机会");
			}
		}
		
		
		
		}
	}

}
