package com.symbiot.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.symbiot.dal.UserRepository;
import com.symbiot.entity.User;
import com.symbiot.entity.Account;


public class MyUserDetails implements UserDetails{
	

	private User user;

	public MyUserDetails(User user) {
		super();
		this.user = user;
	}
	
	

	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//return user.getUserRole().getRole();
		List<SimpleGrantedAuthority> simpleGrantedAuthorityList = new ArrayList<>();

			SimpleGrantedAuthority sga = new SimpleGrantedAuthority(user.getRole().getPrivilege());
			simpleGrantedAuthorityList.add(sga);

		return simpleGrantedAuthorityList;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getLogin();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
