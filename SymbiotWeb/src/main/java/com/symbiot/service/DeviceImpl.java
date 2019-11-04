package com.symbiot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symbiot.dal.DeviceMappingRepository;
import com.symbiot.dal.DeviceRepository;
import com.symbiot.entity.Device;
import com.symbiot.entity.DeviceMapping;
import com.symbiot.entity.User;

@Service
public class DeviceImpl implements IDevice{
	
	@Autowired
	DeviceRepository deviceRepository;
	
	@Autowired
	DeviceMappingRepository deviceMappingRepository;

	@Override
	public List<Device> getDeviceListForLoggedUser(User user) {

		List<DeviceMapping> mappingList = deviceMappingRepository.findByUserId(user.getUser_Id());
		System.out.println("mappingList :"+mappingList.size());
		List<Long> deviceIds = new ArrayList<>();
		for (DeviceMapping deviceMapping : mappingList) {
			if (deviceMapping.getMappingstatus() == 1) {
				deviceIds.add(deviceMapping.getDeviceId());
			}
		}
		System.out.println("deviceIds : "+deviceIds);
		return deviceRepository.findAllById(deviceIds);
	}

}
