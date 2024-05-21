package com.javaInheritanceNCtoNC;


public class Employee extends Department
{
	
	//fields
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	//private String departementName;
	
	
	public Employee()
	{
		
	}

	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	
	//methods
	public void getEmployeeDetails()
	{
		System.out.println(this.employeeId);
		System.out.println(this.employeeName);
		System.out.println(this.employeeSalary);
	}
	
}
