package com.luv2code.springboot.crudDemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.crudDemo.dao.EmployeeDAO;
import com.luv2code.springboot.crudDemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) 
	{
		this.employeeDAO = theEmployeeDAO;
	}

	@Override
	// @Transactional handles transaction management so we don't have to manually start and commit transactions
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);

	}

}
