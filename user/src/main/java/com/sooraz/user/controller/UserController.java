package com.sooraz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sooraz.user.VO.ResponceTemplateVO;
import com.sooraz.user.entity.User;
import com.sooraz.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponceTemplateVO getUser(@PathVariable("id") int id) {
		System.out.println("sooraz 1");
		return userService.getUser(id);
	}
	

}
