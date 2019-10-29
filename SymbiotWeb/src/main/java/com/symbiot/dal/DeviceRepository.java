package com.symbiot.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.symbiot.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Long>{

}
