package com.conway.pangpang.repo;

import java.util.List;

import com.conway.pangpang.domain.Module;

public interface ModuleDao {

	public List<Module> listAllSystemModules();
	
	public List<Long> listUserAccessableModuleIds(String userName);
	
	public void deleteLeafModule(Module module);
	
	public void deleteModulesWithChildren(Module module);
	
	public void updateModule(Module module);
	
	public void updateModulesWithChildren(Module module);
	
	public void insertModule(Module module);
}
