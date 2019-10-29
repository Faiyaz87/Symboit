package com.symbiot.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private long user_Id;
	private String name;
	private String login;
	private String password;
	private String email;
	private String mobile;
	private long role_id;
	private long account_id;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_Id", referencedColumnName = "role_Id",insertable = false, updatable = false)
	private Role role;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_Id", referencedColumnName = "account_id",insertable = false, updatable = false)
	private Account account;
	
	
	public long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
	public long getRole_id() {
		return role_id;
	}
	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", name=" + name + ", login=" + login + ", password=" + password
				+ ", email=" + email + ", mobile=" + mobile + ", role=" + role + ", account=" + account + "]";
	}


	
	
	

	
	
	
	
	
	

}
