package com.luv2code.springboot.crudDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.crudDemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	//define field for entityManager
	private EntityManager entityManager;
	
	
	//set up constructor injection (spring boot creates the entityManager)
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}
	

	@Override
	public List<Employee> findAll() {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create a query
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee",Employee.class);
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		//return the result
		return employees;
	}


	@Override
	public Employee findById(int theId) {

		//get the current hibernate Session 
		Session currentSession = entityManager.unwrap(Session.class);
		
		//get the employee
		Employee theEmployee = 
				currentSession.get(Employee.class, theId);
		
		//return the employee
		return theEmployee;
	}


	@Override
	public void save(Employee theEmployee) {
		//get the current hibernate Session 
		Session currentSession = entityManager.unwrap(Session.class);

		//save employee
		currentSession.saveOrUpdate(theEmployee);
		
	}


	@Override
	public void deleteById(int theId) {

		//get the current hibernate Session 
		Session currentSession = entityManager.unwrap(Session.class);
		
		//delete the employee
		Query theQuery =
				currentSession.createQuery(
						"delete from Employee where id = :id"
						);
		theQuery.setParameter("id", theId);
		
		theQuery.executeUpdate();
		
	}


}
