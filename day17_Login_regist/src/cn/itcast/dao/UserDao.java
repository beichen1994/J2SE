package cn.itcast.dao;

import cn.itcast.pojo.User;

//�û������ӿ�

public interface UserDao {
	
	public abstract boolean isLogin(String username,String password);
	public abstract void regist(User user);

}
