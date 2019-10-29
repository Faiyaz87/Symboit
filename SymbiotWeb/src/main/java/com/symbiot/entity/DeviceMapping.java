package com.symbiot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="devicemapping")
public class DeviceMapping {
	
	@Id
	@GeneratedValue
	private long devicemapping_Id;
	private long account_Id;
	private long user_Id;
	private long device_Id;
	private long mappingstatus;
	
	
	public long getDevicemapping_Id() {
		return devicemapping_Id;
	}
	public void setDevicemapping_Id(long devicemapping_Id) {
		this.devicemapping_Id = devicemapping_Id;
	}
	public long getAccount_Id() {
		return account_Id;
	}
	public void setAccount_Id(long account_Id) {
		this.account_Id = account_Id;
	}
	public long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(long user_Id) {
		this.user_Id = user_Id;
	}
	public long getDevice_Id() {
		return device_Id;
	}
	public void setDevice_Id(long device_Id) {
		this.device_Id = device_Id;
	}
	public long getMappingstatus() {
		return mappingstatus;
	}
	public void setMappingstatus(long mappingstatus) {
		this.mappingstatus = mappingstatus;
	}
	
	
	

}
