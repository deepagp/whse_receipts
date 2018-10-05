package com.ustglobal.integration.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ustglobal.integration.login.to.LoginRequestTO;
import com.ustglobal.integration.login.to.LoginResponseTO;

@Service
public class LoginService {

	@Autowired
	RestTemplate restTemplate;

	@Value("${login.url}")
	private String loginURL;

	public LoginResponseTO validateUser(LoginRequestTO login) {
		return restTemplate.postForObject(loginURL, login, LoginResponseTO.class);
	}

}
