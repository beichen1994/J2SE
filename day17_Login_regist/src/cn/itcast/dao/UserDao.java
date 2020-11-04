package cn.itcast.dao;

import cn.itcast.pojo.User;

//用户操作接口

public interface UserDao {
	
	public abstract boolean isLogin(String username,String password);
	public abstract void regist(User user);

}
