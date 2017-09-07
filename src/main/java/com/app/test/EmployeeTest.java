package com.app.test;

import com.app.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=null;
		emp=new Employee();
		
	    emp.setEmpno(100);
		emp.setEname("Jhon");
		emp.setSal("1000 $");
		
		
		System.out.println("EmployeeDetails :"+emp);
	}

}
