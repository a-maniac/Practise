package com.demo.factory;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class StorageFactory {
	

	public static EmployeeDao getDaoInstance() {
		// TODO Auto-generated method stub
		return new EmployeeDaoImpl();
	}

}
