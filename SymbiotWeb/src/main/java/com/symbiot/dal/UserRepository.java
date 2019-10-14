package com.symbiot.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.symbiot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
