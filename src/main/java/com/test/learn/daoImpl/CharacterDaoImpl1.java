package com.test.learn.daoImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.learn.constants.query.QueryConstatns;
import com.test.learn.dao.CharacterDao1;
import com.test.learn.model.Employee;
import com.test.learn.model.EmployeeSortByAge;
import com.test.learn.model.EmployeeSortByName;
@Repository
public class CharacterDaoImpl1 implements CharacterDao1 {

	public static List<Employee> employeeList = new ArrayList<Employee>();
	@Autowired
	private SessionFactory sessionFactory;

	Session session = null;
	
	@Transactional
	public boolean createEmployee(Employee employee) {
		
		session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(QueryConstatns.INSERT_EMPLOYEE_TABLE);
		query.setParameter(0, employee.getId());
		query.setParameter(1, employee.getName());
		query.setParameter(2, employee.getSex());
		query.setParameter(3, employee.getAge());
		query.setParameter(4, employee.getSalary());
		query.setParameter(5, employee.getRole());
		query.setParameter(6, employee.isPromotion());
		int result = query.executeUpdate();
	    return true;
	}
	
	@Transactional
	public boolean deleteEmployee(Employee employee) {
		boolean status =false;
		session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(QueryConstatns.DELETE_EMPLOYEE_TABLE);
		query.setParameter(0, employee.getName());
		int result = query.executeUpdate();
		status= true;
		return status;
	}
		
	
	@Transactional
	public boolean updateEmployee(Employee employee) {
		boolean status =false;
		session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(QueryConstatns.UPDATE_EMPLOYEE_TABLE);
		query.setParameter(0, employee.getSalary());
		query.setParameter(1, employee.getId());
		int result = query.executeUpdate();
		status= true;
		return status;
		
	}	
		
	public boolean getAllEmployeeInSortedOrder(String or) {
		if(or.equalsIgnoreCase("name")){
	Collections.sort(employeeList, new EmployeeSortByName());
		}
		else if(or.equalsIgnoreCase("age")){
	 Collections.sort(employeeList, new EmployeeSortByAge());
		}
	 for(Employee e : employeeList){
			System.out.println(e);
		}
		return true;
	}
	
	@Transactional
	public List<Employee> readAllEmployeeDetails(Employee employee) {
		session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery(QueryConstatns.SELECT_EMPLOYEE_TABLE);
		query.setParameter(0, employee.getId());
        List empList = query.list();
		return empList;
		
	}

}
