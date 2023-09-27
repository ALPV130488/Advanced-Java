package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.User;

@RestController
@RequestMapping("/myapp")
public class Controller {
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("/details")//http://localhost:4444/myapp/details
	public List<Object> getUsers(){
		
		String url="http://localhost:8089/users";
		Object[] object = resttemplate.getForObject(url,Object[].class);
		
		return Arrays.asList(object);
		
		
	}
	
	@PostMapping("/createuser")
	public void createUser() {
		
		String url = "http://localhost:8089/users";
		
		User user =new User();
		
		user.setFirstname("java");
		user.setEmail("java@gmail.com");
	
	ResponseEntity<User> user1=resttemplate.postForEntity(url, user, User.class);
		
		System.out.println(user1.getBody());
		
		System.out.println("User is inserted successfully");
		
		
		
	}
	

}
