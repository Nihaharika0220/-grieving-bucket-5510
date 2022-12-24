package com.hrms.UseCases;

import com.hrms.Exceptions.DepartmentException;
import com.hrms.bean.Department;
import com.hrms.dao.DepartmentDao;
import com.hrms.dao.DepartmentDaoImp;

public class AddDepartment {
	public static void main(String[] args) {
		
		DepartmentDao  addDepartment = new DepartmentDaoImp() ;
		Department department = new Department(1, "Human Resource", "Amravati") ;
		
		try {
			String result1 = addDepartment.addDepartment(department) ;
			System.out.println(result1);
		} catch (DepartmentException e) {
			e.printStackTrace();
		}
		
	}

}
