package com.symbiot.service;

import java.util.List;

import com.symbiot.entity.Device;
import com.symbiot.entity.User;

public interface IDevice {
	
	public List<Device> getDeviceListForLoggedUser(User user);

}
