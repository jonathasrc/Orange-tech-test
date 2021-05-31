package com.orange.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.orange.entities.Vehicle;
import com.orange.repository.VehicleRepository;
import com.orange.services.exceptions.DatabaseException;
import com.orange.services.exceptions.ResourceNotFoundException;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository repository;
	
	@Autowired
	private FIPEService fipeService;
	
	public List<Vehicle> findAll(){
		return repository.findAll();
	}

	public Vehicle findById(Long id) {
		Optional<Vehicle> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Vehicle insert(Vehicle obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Vehicle update(Long id, Vehicle obj) {
		try {
			
			Vehicle entity = repository.getOne(id);
			updateData(entity, obj); 

			return repository.save(entity);
			
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}

	}
	

	private void updateData(Vehicle entity, Vehicle obj) {
		entity.setBrand(obj.getBrand());
		entity.setModel(obj.getModel());
		entity.setYear(obj.getYear());
		entity.setRotation();
	}
}
