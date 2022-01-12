package com.luv2code.springboot.crudDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.crudDemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	//No need to write any code Spring Data JPA will provide us with 
	//findAll , save , findById , deleteById ...
}
