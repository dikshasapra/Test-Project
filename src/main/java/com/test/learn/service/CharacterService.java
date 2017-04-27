package com.test.learn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.learn.model.Employee;

@Service
public interface CharacterService {
  public String getTheName(String name);
  public String getTheNames(String name, int age);
  public List<Employee> getAllEmpNames();
  public Employee getFullDetail(String id);
  public Employee getFullDetails(Employee employee);
  public String getDetail(Employee emp);
  public boolean setDetails(Employee emp);
  public boolean delDetails(Employee emp);
  public boolean updateDetails(Employee emp);
  public boolean getDEtailInSortedOrder(String or);
  public List<Employee> readAllEmpNames(Employee employee);
}
