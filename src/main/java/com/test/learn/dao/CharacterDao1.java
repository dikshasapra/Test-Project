package com.test.learn.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.learn.model.Employee;
@Repository
public interface CharacterDao1 {
 public boolean createEmployee(Employee employee);
 public boolean deleteEmployee(Employee employee);
 public boolean updateEmployee(Employee employee);
 public boolean getAllEmployeeInSortedOrder(String or);
 public List<Employee> readAllEmployeeDetails(Employee employee);
}
