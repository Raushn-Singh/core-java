package com.training.method.references;

import java.util.Arrays;

public class MethodReferenceDemo {

	public static void main(String[] args) {
        // static method :Class  named
		EmployeeValidation validEmployee=Employee::validateEmpdetails;
		//create Instance for the class where the method is located
		Employee e=new Employee();
		EmployeeValidation valEmployeeValidation=e::validateEmpdetails2;
		// validating Employee details
		Employee emp1=new Employee();
		System.out.println(validEmployee.isValidEmployee(emp1));
		Employee emp2=new Employee();
		emp2.setId(123);
		emp2.setName("Raushan Singh");
		emp2.setGender("Male");
		emp2.setSalary(5000);
		System.out.println(validEmployee.isValidEmployee(emp2));
		System.out.println(valEmployeeValidation.isValidEmployee(emp2));
		// access instance method with class name also
		EmployeeValidation valEmployeeValidation2=Employee::validSalary;
		System.out.println(valEmployeeValidation2.isValidEmployee(emp2));
	    String[] values= {"Raushan","java","Spring","Methods"}; 
//		 Arrays.sort(values, (o1,o2)->o1.compareToIgnoreCase(o2) );
		Arrays.sort(values,String::compareToIgnoreCase);
		 for(String str:values) {
			System.out.println(str);
		}
	}

}
