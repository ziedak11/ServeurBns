package com.bns.ServeurBns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bns.ServeurBns.dao.UserDao;
import com.bns.ServeurBns.model.User;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	 private UserDao udao;
	
	@PostMapping("/ajouterUser")
	public void ajouterUser(@RequestBody List<User>user) {
		for (User u: user) {
			udao.save(u);
		}
	}

	@GetMapping("/afficherUsers")
	public List<User> afficherUsers(){
		
		return(List<User>) udao.findAll();
	}
	
}
