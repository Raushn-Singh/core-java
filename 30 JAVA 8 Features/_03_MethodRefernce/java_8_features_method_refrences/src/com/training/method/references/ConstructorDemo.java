package com.training.method.references;

public class ConstructorDemo {
public static void main(String args[]) {
	GetEmployeeInstance employee=Employee::new;
	Employee emp = employee.getEmployee(10, "Raushan Singh");
	System.out.println(emp.getId());
	System.out.println(emp.getName());
}
}
