package com.luv2code.springboot.crudDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.luv2code.springboot.crudDemo.entity.Employee;
//because we added spring data rest 
//the repository will be created automatically because we are using Employee a repo of /employees will be created

//@RepositoryRestResource(path="members")//spring data rest will now expose /members instead of /employees.
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	//No need to write any code Spring Data JPA will provide us with 
	//findAll , save , findById , deleteById ...
}
