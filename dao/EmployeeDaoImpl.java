package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import com.demo.beans.Employee;
import com.demo.comparator.MySalComparator;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static List <Employee> elist;
	
	static {
		elist = new ArrayList<>(100);
		elist.add(new Employee(12,"Aman",9888889));
		elist.add(new Employee(13,"AJ",9888889));
		elist.add(new Employee(14,"Maniac",9888889));
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		elist.add(employee);	
	}

	@Override
	public List<Employee> findAllEmployee() {
		if(!elist.isEmpty())
			return elist;
		return null;
	}

	@Override
	public boolean deleteEmployee(int id) {
		Employee e=new Employee(id);
		return elist.remove(e);
	}

	@Override
	public boolean updateInfo(int id, String nm, double sal) {
		
		Employee e2= searchById(id);
		
		e2.setEname(nm);
		e2.setSal(sal);
		
		return true;
	}

	@Override
	public Employee searchById(int id) {
		Employee e= new Employee(id);
		int pos=elist.indexOf(e);
		if(pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		
		List<Employee> result = new ArrayList<>();
		for(Employee e: elist) {
			if(e.getEname().equals(name)) {
				result.add(e);
			}
		}
		
		return result;
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		//if this gets error then add comparable to the Employee class.
		List<Employee> l= (List<Employee>) ((ArrayList) elist).clone();
		Collections.sort(l);
		return l ;
	}

	@Override
	public Queue<Employee> sortByPatternUsingSal(String pattern) {
		
		PriorityQueue<Employee>pq= new PriorityQueue<>(new MySalComparator());
		for(Employee e:elist) {
			if(e.getEname().contains(pattern)) {
				pq.add(e);
			}
		}
		return pq;
		

	}
	

	

}
