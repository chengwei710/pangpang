package com.conway.pangpang.repo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.conway.pangpang.domain.Module;

@Repository
@Transactional
public class ModuleDaoImpl implements ModuleDao {
	
	@Autowired
    private EntityManager em;
	
	@Override
	@Cacheable(value="ehcache.main_menu", key="all_menu")
	public List<Module> listAllSystemModules() {
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Module> criteria = cb.createQuery(Module.class);
		Root<Module> module = criteria.from(Module.class);
		criteria.select(module).orderBy(cb.asc(module.get("moduleId")));
		return em.createQuery(criteria).getResultList();
	}
	
	@Override
	public List<Module> listAllMenuModules() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Module> criteria = cb.createQuery(Module.class);
		Root<Module> module = criteria.from(Module.class);
		//module.join();
		
		return null;
	}
	
	@Override
	@Cacheable(value = "ehcache.main_menu", key = "#userName+'_module_ids'")
	public List<Long> listUserAccessableModuleIds(String userName) {
		
		String querySql = "select rm.module_id from user u, user_role ur, role_module rm "
				+ " where u.id = ur.user_id and ur.role_id = rm.role_id and u.user_name = :userName";
		Query query = em.createNativeQuery(querySql);
		query.setParameter("userName", userName);
	
		List<Long> returnList = new ArrayList<Long>();
		List<Integer> resultList = query.getResultList();//got integer list
		for(Integer obj : resultList){
			returnList.add(new Long(obj.longValue()));
		}
		return returnList;
	}

	@Override
	@CacheEvict(value = "ehcache.main_menu")
	public void deleteLeafModule(Module module) {
		em.remove(module);
	}

	@Override
	@CacheEvict(value = "ehcache.main_menu")
	public void deleteModulesWithChildren(Module module) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@CacheEvict(value = "ehcache.main_menu")
	public void updateModule(Module module) {
		em.merge(module);
	}

	@Override
	@CacheEvict(value = "ehcache.main_menu")
	public void updateModulesWithChildren(Module module) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@CacheEvict(value = "ehcache.main_menu")
	public void insertModule(Module module) {
		em.persist(module);
	}

	@Override
	public Module loadModule(Long moduleId) {
		return em.find(Module.class, moduleId);
	}

}
