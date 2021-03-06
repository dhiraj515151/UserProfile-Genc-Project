package com.cognizant.loginService.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("dhiraj".equals(username)) {
			return new User("dhiraj", "$2a$10$Zieo/Y0/W3Hs3rCEHu/zpOMqUSTAWQCXz/gJJsUbkGB81pVqp1nDK",
					new ArrayList<>()); //encrypted form of my password as password
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}