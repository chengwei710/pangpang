package com.conway.pangpang.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Module implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="module_id")
	private Long moduleId;
	
	@Column(name="parent_id")
	private Long parentId;
	
	@Column(name="module_name")
	private String moduleName;
	
	private boolean LEAF;
	
	private String URL;
	
	private String icon;
	
	@Column(name="list_order")
	private Integer listOrder;
	
	@Column(name="module_type")
	private Integer moduleType;
	
	private Integer status;
	
	private String remark;
	
	@Transient
	private List<Module> childModules;

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public boolean isLEAF() {
		return LEAF;
	}

	public void setLEAF(boolean lEAF) {
		LEAF = lEAF;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public Integer getListOrder() {
		return listOrder;
	}

	public void setListOrder(Integer listOrder) {
		this.listOrder = listOrder;
	}

	public Integer getModuleType() {
		return moduleType;
	}

	public void setModuleType(Integer moduleType) {
		this.moduleType = moduleType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<Module> getChildModules() {
		return childModules;
	}

	public void setChildModules(List<Module> childModules) {
		this.childModules = childModules;
	}
}
