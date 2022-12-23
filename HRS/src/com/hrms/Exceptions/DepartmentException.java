package com.hrms.Exceptions;

public class DepartmentException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	public DepartmentException() {
		
	}
	
	public DepartmentException(String msg) {
			super(msg) ;
		}

}
