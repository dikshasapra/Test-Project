package com.test.learn.model;

import java.util.Comparator;

public class EmployeeSortByAge implements Comparator<Employee> {

	public int compare(Employee arg1, Employee arg2) {
		return (arg1.getAge() < arg2.getAge() ) ? -1: (arg1.getAge() > arg2.getAge() ) ? 1:0 ;
	}

}
