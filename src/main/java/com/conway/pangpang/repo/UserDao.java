package com.conway.pangpang.repo;

import com.conway.pangpang.domain.User;
import com.conway.pangpang.domain.UserInfo;


public interface UserDao {
	
    public void register(UserInfo userInfo);
    
    public User getLoginInfo(String userName, String password);
    
    public UserInfo getUserInfoById(Long userId);

	public User getLoginInfoByName(String userName);

	public void updateLoginInfo(User login);
}
