package com.vms.dao;

import org.springframework.data.repository.CrudRepository;

import com.vms.bean.Vehicle;

//Interface to perform CRUD Operations
public interface VehicleDAO extends CrudRepository<Vehicle, Integer>{
	
}
