package com.conway.pangpang.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.enterprise.inject.Default;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.DefaultValue;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	@Size(min=1, max=20)
	@Pattern(regexp = "[A-Za-z1-9]*", message = "must contain only letters and number")
	@Column(name = "user_name")
	private String userName;
	
	@NotNull
	private String password;
	
	//this field do not save into DB
	@Transient
	private String rePassword;
	
	@Column(name = "last_login_ip")
	private String lastLoginIp;
	
	@Column(name = "last_login_time")
	private Timestamp lastLoginTime;
	
	@Column(name = "login_times")
	private Integer loginTimes;
	
	private String disabled;
	
	@Column(name = "need_change_pwd")
	private String needChangePwd;
	
	@Column(name = "pwd_change_date")
	private Date pwdChangeDate;
	
	//this field do not save into DB
	@Transient
	private Boolean rememberMe;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(Integer loginTimes) {
		this.loginTimes = loginTimes;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getNeedChangePwd() {
		return needChangePwd;
	}

	public void setNeedChangePwd(String needChangePwd) {
		this.needChangePwd = needChangePwd;
	}

	public Boolean getRememberMe() {
		return rememberMe;
	}

	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	public Date getPwdChangeDate() {
		return pwdChangeDate;
	}

	public void setPwdChangeDate(Date pwdChangeDate) {
		this.pwdChangeDate = pwdChangeDate;
	}
}
