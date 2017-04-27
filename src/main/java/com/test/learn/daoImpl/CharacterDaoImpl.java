package com.test.learn.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.learn.dao.CharacterDao;
import com.test.learn.model.Employee;
@Repository
public class CharacterDaoImpl implements CharacterDao {
/*	public static List<Employee> list1 = null;


	static {
		   Employee e1= new Employee();
			e1.setId("104");
			e1.setName("geeta");
			e1.setSex("female");
			e1.setAge(31);
			e1.setSalary(1000);
			e1.setRole("team lead");
			e1.setPromotion(false);
			
			Employee e2= new Employee();
			e2.setId("105");
			e2.setName("seeta");
			e2.setSex("female");
			e2.setAge(26);
			e2.setSalary(9000);
			e2.setRole("sr. developer");
			e2.setPromotion(true);
			
			Employee e3= new Employee();
			e3.setId("106");
			e3.setName("rita");
			e3.setSex("female");
			e3.setAge(28);
			e3.setSalary(8000);
			e3.setRole("developer");
			e3.setPromotion(true);
			list1.add(e1);
			list1.add(e2);
			list1.add(e3);
	   }
*/
	
	public Employee getEmployeeDetails(String id) {
		Employee employeeDetails = null;
		
		Employee e1= new Employee();
		e1.setId("100");
		e1.setName("sid");
		e1.setSex("male");
		e1.setAge(31);
		e1.setSalary(1000);
		e1.setRole("team lead");
		e1.setPromotion(false);
		
		Employee e2= new Employee();
		e2.setId("101");
		e2.setName("diksha");
		e2.setSex("female");
		e2.setAge(26);
		e2.setSalary(9000);
		e2.setRole("sr. developer");
		e2.setPromotion(true);
		
		Employee e3= new Employee();
		e3.setId("102");
		e3.setName("rohit");
		e3.setSex("male");
		e3.setAge(28);
		e3.setSalary(8000);
		e3.setRole("developer");
		e3.setPromotion(true);
		
	if (id.equalsIgnoreCase("100")){
		employeeDetails = e1;
	}
		
	if (id.equalsIgnoreCase("101")){
		employeeDetails = e2;
	}
		
	if (id.equalsIgnoreCase("102")){
		employeeDetails = e3;
	}
		return employeeDetails;
	}
	public List<Employee> getAllEmployeeDetails() {
		Employee e1= new Employee();
		e1.setId("100");
		e1.setName("sid");
		e1.setSex("male");
		e1.setAge(31);
		e1.setSalary(1000);
		e1.setRole("team lead");
		e1.setPromotion(false);
		
		Employee e2= new Employee();
		e2.setId("101");
		e2.setName("diksha");
		e2.setSex("female");
		e2.setAge(26);
		e2.setSalary(9000);
		e2.setRole("sr. developer");
		e2.setPromotion(true);
		
		Employee e3= new Employee();
		e3.setId("102");
		e3.setName("rohit");
		e3.setSex("male");
		e3.setAge(28);
		e3.setSalary(8000);
		e3.setRole("developer");
		e3.setPromotion(true);
		
		List<Employee> list= new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		
		return list;
	}
	
	public Employee getEmpDetails(Employee employee) {
     Employee employeeDetails = null;
		
		Employee e1= new Employee();
		e1.setId("100");
		e1.setName("sid");
		e1.setSex("male");
		e1.setAge(31);
		e1.setSalary(1000);
		e1.setRole("team lead");
		e1.setPromotion(false);
		
		Employee e2= new Employee();
		e2.setId("101");
		e2.setName("diksha");
		e2.setSex("female");
		e2.setAge(26);
		e2.setSalary(9000);
		e2.setRole("sr. developer");
		e2.setPromotion(true);
		
		Employee e3= new Employee();
		e3.setId("102");
		e3.setName("rohit");
		e3.setSex("male");
		e3.setAge(28);
		e3.setSalary(8000);
		e3.setRole("developer");
		e3.setPromotion(true);
		
	if (employee.getId().equalsIgnoreCase("100")){
		employeeDetails = e1;
	}
		
	if (employee.getId().equalsIgnoreCase("101")){
		employeeDetails = e2;
	}
		
	if (employee.getId().equalsIgnoreCase("102")){
		employeeDetails = e3;
	}
		return employeeDetails;
	}
	
}
