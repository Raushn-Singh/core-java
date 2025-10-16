package com.training.method.references;

public class Employee {

	private int id;
	private String name;
    private String gender;
    private double salary;
    
    //Constructor
    Employee(){
    	System.out.println("This is employee constructor with no data");
    }
    Employee(int eid,String name){
    	System.out.println("This is employee constructor with data");
    	this.id=eid;
    	this.name=name;
    }
    // static method
    static boolean validateEmpdetails(Employee employee) {
    	if(employee.getId()!=0&&employee.getName()!=null)
    		return true;
    	return false;
    }
    // non-static method/instance method
     boolean validateEmpdetails2(Employee employee) {
    	if(employee.getId()!=0&&employee.getName()!=null)
    		return true;
    	return false;
    }
    boolean validSalary() {
    	return this.getSalary()>0?true:false;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}