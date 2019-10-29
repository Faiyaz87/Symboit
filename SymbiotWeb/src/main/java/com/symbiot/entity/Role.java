package com.symbiot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue
	private long role_Id;
	private String role;
	private String privilege;
	
	@OneToOne(mappedBy = "role")
	private User user;
	
	public long getRole_Id() {
		return role_Id;
	}
	public void setRole_Id(long role_Id) {
		this.role_Id = role_Id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
			
	

}
