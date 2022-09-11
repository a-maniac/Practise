package com.demo.beans;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String ename;
	private double sal;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int id) {
		this(id,null,0);
	}

	public Employee(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}
	
	public boolean equals(Object ob) {
		Employee e=(Employee)ob;
		if(this.empId!=e.empId) {
			return false;
		}
		return true;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.ename.compareTo(o.ename);
	}
	
}
