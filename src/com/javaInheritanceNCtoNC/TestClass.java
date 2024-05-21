package com.javaInheritanceNCtoNC;

public class TestClass {

	public static void main(String[] args) {
		
		Department department = new Department(2299, "Development");
		department.getDepartmentDetails();
		
		System.out.println("==================================");
		
		Employee employee = new Employee(101, "Ganesh", 47584.34);
		employee.getEmployeeDetails();
		
		employee.setDepartementId(3344);
		employee.setDepartementName("HR");
		employee.getDepartmentDetails();
	}

}
