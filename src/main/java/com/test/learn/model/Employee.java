package com.test.learn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="employee_table")
public class Employee {
	@Id
	@Column(name="id")
	String id;
	@Column(name="name")
	String name;
	@Column(name="sex")
	String sex;
	@Column(name="age")
	int age;
	@Column(name="salary")
	double salary;
	@Column(name="role")
	String role;
	@Column(name="promotion")
	boolean promotion;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isPromotion() {
		return promotion;
	}
	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + ", salary=" + salary + ", role=" + role
				+ ", promotion=" + promotion + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
