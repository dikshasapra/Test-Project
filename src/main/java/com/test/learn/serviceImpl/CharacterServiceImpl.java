package com.test.learn.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.learn.dao.CharacterDao;
import com.test.learn.dao.CharacterDao1;
import com.test.learn.model.Employee;
import com.test.learn.service.CharacterService;

@Service
public class CharacterServiceImpl implements CharacterService {
	
	@Autowired
	private CharacterDao characterDao;
	
	@Autowired
	private CharacterDao1 characterDao1;
	
	
	public String getTheName(String name) {
		if (name.equalsIgnoreCase("sunny"))
			return "Siddharth";
		if (name.equalsIgnoreCase("honey"))
			return "Girish";
		else
			return "No name";
	}

	public String getTheNames(String name, int age) {
		if (name.equalsIgnoreCase("sunny")&& age==31)
			return "diksha";
		if (name.equalsIgnoreCase("honey") && age==30)
			return "sonam";
		else
			return "No name";
	}

	public List<Employee> getAllEmpNames() {
		List<Employee> list= characterDao.getAllEmployeeDetails();
		return list;
	}

	public Employee getFullDetail(String id) {
		Employee emp= characterDao.getEmployeeDetails(id);// TODO Auto-generated method stub
		return emp;
	}

	public Employee getFullDetails(Employee employee) {
		Employee emp= characterDao.getEmpDetails(employee);
		return emp;
	}

	public String getDetail(Employee emp) {
		if (emp.getName().equalsIgnoreCase("sunny")&& emp.getAge()==31)
			return "diksha";
		if (emp.getName().equalsIgnoreCase("honey") && emp.getAge()==30)
			return "sonam";
		else
			return "No name";
	}

	public boolean setDetails(Employee emp) {
		boolean st= characterDao1.createEmployee(emp);
		return true;
	}

	public boolean delDetails(Employee emp) {
		boolean status= characterDao1.deleteEmployee(emp);
		return status;
	}

	public boolean updateDetails(Employee emp) {
		boolean status= characterDao1.updateEmployee(emp);
		return status;
	}

	public boolean getDEtailInSortedOrder(String or) {
		boolean status= characterDao1.getAllEmployeeInSortedOrder(or);
		return status;
	}
	
	public List<Employee> readAllEmpNames(Employee employee) {
		List<Employee> list= characterDao1.readAllEmployeeDetails(employee);
		return list;
	}
		
	}
	
	

