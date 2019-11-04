package com.symbiot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="devicemapping")
public class DeviceMapping {
	
	@Id
	@GeneratedValue
	private long devicemappingId;
	private long accountId;
	private long userId;
	private long deviceId;
	private long mappingstatus;
	
	
	public long getDevicemappingId() {
		return devicemappingId;
	}
	public void setDevicemappingId(long devicemappingId) {
		this.devicemappingId = devicemappingId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}
	public long getMappingstatus() {
		return mappingstatus;
	}
	public void setMappingstatus(long mappingstatus) {
		this.mappingstatus = mappingstatus;
	}
	
	

}
