package com.ctac.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ctac.springboot.model.User;
import com.ctac.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}