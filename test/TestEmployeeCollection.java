package com.demo.test;

import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeCollection {
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	
	

	int choice=0;
	EmployeeService employeeService =new EmployeeServiceImpl();
	
	do {
		System.out.println("\n1.Add an employee\n2. Delete an employee\n3. Modify an employee"
				+ "\n4. Search by Id\n5. Search by Name\n6. Display all\n"
				+ "7.sort by name\n8. sort by sal\n9. Exit");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			employeeService.addnewEmployee();	
			
			break;
		case 2:
			//equals wala in model and parameterized constructor with only Id as input
			System.out.println("Enter id");
			int id=sc.nextInt();
			
			
			boolean status = employeeService.deleteEmployee(id);
			if(status==true) {
				System.out.println("Employee Deleted");
			}
			else {
				System.out.println("Employee Not Found");
			}
			
			break;
		case 3:
			System.out.println("enter id of Employee for Modification");
			id= sc.nextInt();
			System.out.println("Enter new Name");
			String nm=sc.next();
			System.out.println("Enter new sal");
			double sal=sc.nextDouble();
			employeeService.modifyEmployee(id,nm,sal);
			
			break;
		case 4:
			System.out.println("Enter id");
			id=sc.nextInt();
			
			Employee e=employeeService.searchById(id);
			System.out.println(e);
			
			break;
		case 5:
			System.out.println("Enter the name: ");
			String name=sc.next();
			List<Employee> elist= employeeService.findByName(name);
			for (Employee e2:elist) {
				System.out.println(e2);
			}
			
			break;
		case 6:
			List<Employee> elist1 =employeeService.findAll();
			if(elist1!=null) {
				for(Employee e1: elist1) {
					System.out.println(e1);	
				}
			}
			else {
					System.out.println("No employee found");
				}
			
			break;
		case 7:
			elist=employeeService.sortByName();
			for(Employee e3:elist) {
				System.out.println(e3);
			}
			break;
		case 8:
			System.out.println("Enter pattern");
			String pattern =sc.next();
			Queue<Employee> q= employeeService.sortByPatternUsingSal(pattern);
			if(q!=null)
				for(Employee e4:q) {
					System.out.println(e4);
				}
			else{
				System.out.println("Pattern not found");
			}
			break;
		case 9:
			System.out.println("Thank you for visiting...");
			break;
		}
	}while(choice !=9);
	

	
	}
}
