package com.orange.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orange.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User(1L, "Jonathas", "Jonathas@gmail.com","111111111-11","24-05-2000");
		
		return ResponseEntity.ok().body(u);
	}
}
