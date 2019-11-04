package com.symbiot.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.symbiot.entity.Device;
import com.symbiot.entity.DeviceMapping;
import com.symbiot.entity.User;

public interface DeviceMappingRepository extends JpaRepository<DeviceMapping, Long>{
	List<DeviceMapping> findByUserId(Long user_Id);
}
