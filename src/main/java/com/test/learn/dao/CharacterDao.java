package com.test.learn.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.learn.model.Employee;

@Repository
public interface CharacterDao {
	public Employee getEmployeeDetails(String id);
	public List<Employee> getAllEmployeeDetails();
	public Employee getEmpDetails(Employee employee);
	

}
