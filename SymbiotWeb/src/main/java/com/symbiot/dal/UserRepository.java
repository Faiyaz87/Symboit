package com.symbiot.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.symbiot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByLogin(String Login);
}
