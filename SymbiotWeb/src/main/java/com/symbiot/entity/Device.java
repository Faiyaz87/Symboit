package com.symbiot.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Device")
public class Device {
	
	@Id
	@GeneratedValue
	private long device_Id;
	private String devicename;
	private String devicetype;
	private String mac;
	private Timestamp adddate;
	private String datastr;
	private long laststatus;
	
	
	public long getDevice_Id() {
		return device_Id;
	}
	public void setDevice_Id(long device_Id) {
		this.device_Id = device_Id;
	}
	public String getDevicename() {
		return devicename;
	}
	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
	public String getDevicetype() {
		return devicetype;
	}
	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public Timestamp getAdddate() {
		return adddate;
	}
	public void setAdddate(Timestamp adddate) {
		this.adddate = adddate;
	}
	public String getDatastr() {
		return datastr;
	}
	public void setDatastr(String datastr) {
		this.datastr = datastr;
	}
	public long getLaststatus() {
		return laststatus;
	}
	public void setLaststatus(long laststatus) {
		this.laststatus = laststatus;
	}
	
	

}
