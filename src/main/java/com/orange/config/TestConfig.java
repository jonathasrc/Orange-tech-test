package com.orange.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.orange.entities.User;
import com.orange.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Jonathas", "Jonathas@gmail.com","111111111-11","24-05-2000");
		User u2 = new User(null, "Jonathas", "Jonathas@gmail.com","111111111-11","24-05-2000");
		
		System.out.println(u1.equals(u2));
		
		repository.saveAll(Arrays.asList(u1, u2));
	}

}
