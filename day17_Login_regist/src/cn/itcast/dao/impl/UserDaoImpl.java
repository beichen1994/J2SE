package cn.itcast.dao.impl;

import java.util.ArrayList;

import cn.itcast.dao.UserDao;
import cn.itcast.pojo.User;


public  class UserDaoImpl implements UserDao{

	private static ArrayList<User> arr = new ArrayList<User>();  //��ͨ��Ա������ÿ���������еģ�������static���ܹ���
	
	@Override
	public boolean isLogin(String username, String password) {
		//�����õ�ÿһ���û����û��������룬�ʹ��ݹ������û�����������бȶ�
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
