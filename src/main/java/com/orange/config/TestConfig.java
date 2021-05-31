package com.orange.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.orange.entities.User;
import com.orange.entities.Vehicle;
import com.orange.repository.UserRepository;
import com.orange.repository.VehicleRepository;
import com.orange.utils.GetDayOfWeek;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private VehicleRepository vehiclesRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Jonathas", "Jonathas@gmail.com","111111111-11","24-05-2000");
		User u2 = new User(null, "Jonathas", "Jonathas@gmail.com","111111111-11","24-05-2000");
		
		Vehicle v1 = new Vehicle(null, "VW - VolksWagen","AMAROK High.CD 2.0 16V TDI 4x4 Dies. Aut", "2014");
		Vehicle v2 = new Vehicle(null, "VW - VolksWagen","AMAROK High.CD 2.0 16V TDI 4x4 Dies. Aut", "2014");
		
		

		
		userRepository.saveAll(Arrays.asList(u1, u2));
		vehiclesRepository.saveAll(Arrays.asList(v1, v2));
		
		u1.getVehicles().add(v1);
		
		userRepository.save(u1);
		
		
		
	}

}
