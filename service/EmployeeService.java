package com.demo.service;

import java.util.List;
import java.util.Queue;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	List<Employee> findAll();

	

	boolean deleteEmployee(int id);

	boolean modifyEmployee(int id, String nm, double sal);

	Employee searchById(int id);

	List<Employee> findByName(String name);

	List<Employee> sortByName();

	Queue<Employee> sortByPatternUsingSal(String pattern);

}
