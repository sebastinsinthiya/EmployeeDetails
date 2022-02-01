package org.emp;

public class Employee {
	public void empId() {
		System.out.println("Employee id is:76854");
	}
	public void empName() {
		System.out.println("Employee name is:sinthu");
	}
	public void empDob() {
		System.out.println("Employee DOB:15-03-2021");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
	}

}
