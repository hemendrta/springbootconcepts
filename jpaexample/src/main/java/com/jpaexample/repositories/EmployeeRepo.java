package com.jpaexample.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jpaexample.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	
	/*
	Mentioned link can be used for creating queries in the repository as per our requirements.

	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	*/

}
