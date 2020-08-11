package com.crud.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.crud.model.User;
import com.crud.service.UserService;

@Configuration
@Component
public class UserController {

	@Autowired
    private UserService service;
	
	@GetMapping(path = "/users/" )
	public String list() {
//		User user =new User(1,"khushi","test");
//	    service.save(user);
	    return "Added";
	}
	
}
