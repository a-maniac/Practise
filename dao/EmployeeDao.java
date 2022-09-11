package com.demo.dao;

import java.util.List;
import java.util.Queue;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee employee);

	List<Employee> findAllEmployee();

	boolean deleteEmployee(int id);

	boolean updateInfo(int id, String nm, double sal);

	Employee searchById(int id);

	List<Employee> findByName(String name);

	List<Employee> sortByName();

	Queue<Employee> sortByPatternUsingSal(String pattern);

}
