package com.test.learn.constants.query;

public class QueryConstatns {
	public static final String INSERT_EMPLOYEE_TABLE = "insert into employee_table(id, name, sex, age, salary, role, promotion) values(?,?,?,?,?,?,?)";
	public static final String UPDATE_EMPLOYEE_TABLE = "UPDATE employee_db.employee_table SET salary=? WHERE id=?";
	public static final String DELETE_EMPLOYEE_TABLE = "DELETE FROM employee_db.employee_table WHERE name=?";
	public static final String SELECT_EMPLOYEE_TABLE = "Select *  from employee_db.employee_table where id=?";
}
