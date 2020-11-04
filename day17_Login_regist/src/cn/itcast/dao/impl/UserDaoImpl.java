package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;


public  class UserDaoImpl implements UserDao{

	private static ArrayList<User> arr = new ArrayList<User>();  //普通成员变量是每个对象特有的，必须变成static才能共享
	
	@Override
	public boolean isLogin(String username, String password) {
		//遍历得到每一个用户的用户名和密码，和传递过来的用户名和密码进行比对
		boolean flag = false;
		for(User u : arr){
			if(u.getUsername().equals(username) && u.getPassword().equals(password)){
				flag = true;
				break;
			}
		}
		return flag;
		
		
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		arr.add(user);
		
	}
	

	
}
