package com.luv2code.springboot.crudDemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.crudDemo.dao.EmployeeDAO;
import com.luv2code.springboot.crudDemo.entity.Employee;
import com.luv2code.springboot.crudDemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) 
	{
		this.employeeService = employeeService;
	}
	
	
	//expose "/employees" and reutn list of employees
	@GetMapping("/employees")
	public List<Employee> findAll()
	{
		return employeeService.findAll();
	}
	
	
	//add mapping for Get / employees/{employeeId}
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) 
	{
		Employee theEmployee = employeeService.findById(employeeId);
		
		if(theEmployee == null) 
		{
			throw new RuntimeException("Employee id not found - "+employeeId);
		}
	
		return theEmployee;
	}

	//add mapping for Post /employees - add new employee
	@PostMapping("/employees")
	//@RequestBody to bind the JSON to the employee object
	public Employee addEmployee(@RequestBody Employee theEmployee) 
	{
		//this is to force a save of new item ..instead of update
		theEmployee.setId(0);
		employeeService.save(theEmployee);
		return theEmployee;
		
	}
	
	//add mapping for PUT / employee - update existing employee
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) 
	{
		employeeService.save(theEmployee);
		return theEmployee;
	}
	
  //add mapping for DELETE / employee 
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int theEmployeeId) 
	{
		Employee tempEmployee = employeeService.findById(theEmployeeId);
		if(tempEmployee == null) 
		{
			throw new RuntimeException("Employee not found");
		}
		employeeService.deleteById(theEmployeeId);
		
		return "Employee with ID  : "+theEmployeeId +" was deleted ! ";
	}
	
}
