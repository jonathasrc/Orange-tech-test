package com.orange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
