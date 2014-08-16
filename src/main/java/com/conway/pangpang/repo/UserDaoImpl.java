package com.conway.pangpang.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.conway.pangpang.domain.User;
import com.conway.pangpang.domain.UserInfo;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
    private EntityManager em;
	
	@Override
	public void register(UserInfo userInfo) {
		
		em.persist(userInfo);
	}

	@Override
	public User getLoginInfo(String userName, String password) {
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> users = criteria.from(User.class);
		
		criteria.select(users).where(
				builder.and(builder.equal(users.get("userName"), userName),
						builder.equal(users.get("password"), password)));
		
		List<User> userList = em.createQuery(criteria).getResultList();
		
		return userList.size() == 0 ? null : userList.get(0);
	}

	@Override
	public UserInfo getUserInfoById(Long userId) {
	
		return em.find(UserInfo.class, userId);
	}

	@Override
	public User getLoginInfoByName(String userName) {
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<User> criteria = builder.createQuery(User.class);
		Root<User> users = criteria.from(User.class);
		
		criteria.select(users).where(builder.equal(users.get("userName"), userName));
        List<User> userList = em.createQuery(criteria).getResultList();
		
		return userList.size() == 0 ? null : userList.get(0);
	}

	@Override
	public void updateLoginInfo(User login) {
		em.merge(login);
	}

	
}
