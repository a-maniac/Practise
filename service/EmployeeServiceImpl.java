package com.demo.service;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.factory.StorageFactory;

public class EmployeeServiceImpl implements EmployeeService {

	   private EmployeeDao employeeDao; 
	   
		
		public EmployeeServiceImpl() {
			
		   employeeDao=StorageFactory.getDaoInstance();
	    }

			
	@Override
	public void addnewEmployee() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Id: ");
		int id=sc.nextInt();
		
		System.out.println("Enter the name: ");
		String nm=sc.next();
		
		//sc.nextLine(); agar nextLine lagaya toh name print nahi hora
		
		System.out.println("Enter the salary: ");
		double sal=sc.nextDouble();
		
		employeeDao.saveEmployee(new Employee(id,nm,sal));
		
		
	}
	@Override
	public List<Employee> findAll() {
		
		return employeeDao.findAllEmployee();
	}
	

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployee(id);
	}


	@Override
	public boolean modifyEmployee(int id, String nm, double sal) {
		return employeeDao.updateInfo(id,nm,sal);
		
	}


	@Override
	public Employee searchById(int id) {
		
		return employeeDao.searchById(id);
	}


	@Override
	public List<Employee> findByName(String name) {
		
		return employeeDao.findByName(name);
	}


	@Override
	public List<Employee> sortByName() {
		
		return employeeDao.sortByName();
	}


	@Override
	public Queue<Employee> sortByPatternUsingSal(String pattern) {
		
		return employeeDao.sortByPatternUsingSal(pattern);
	}

}
