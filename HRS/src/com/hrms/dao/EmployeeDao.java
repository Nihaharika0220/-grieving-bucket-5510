package com.hrms.dao;

import java.util.List;

import com.hrms.Exceptions.EmployeeException;
import com.hrms.bean.Employee;
import com.hrms.bean.Leaves;

public interface EmployeeDao {
	
	public String ragisterEmployee(Employee employee);
	public String transferEmployee (int empId , int deptId) ;
	public List<Leaves> getLeavesList() ;
	public List<Employee> viewEmployee()  ;
	public List<Employee> viewEmployeeByDepartment(int deptId);
	public String acceptLeave(int empId) ;
	public String rejectLeave(int empId) ;
	public boolean adminLogin(String username , String password);

}
