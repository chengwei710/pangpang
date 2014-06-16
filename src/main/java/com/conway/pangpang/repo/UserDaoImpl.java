package com.conway.pangpang.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.conway.pangpang.domain.User;
import com.conway.pangpang.domain.UserInfo;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Override
	public void register(UserInfo userInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getLoginInfo(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo getUserInfoById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getLoginInfoByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLoginInfo(User login) {
		// TODO Auto-generated method stub
		
	}

	
}
