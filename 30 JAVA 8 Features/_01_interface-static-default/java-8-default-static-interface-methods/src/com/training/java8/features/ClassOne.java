package com.training.java8.features;

public class ClassOne implements InterfaceOne {
 // impl. of Abstract methods
	@Override
	public void printNames() {
     		System.out.println("Printing names");
	}

	@Override
	public String getNames() {
           System.out.println("getting names");	
           return "default Method";
	}
	public void deafultMethodOne() {
		System.out.println("class override the default method from interface");
		//logic
		//System.out.println("Inside current class  Default Method One..");
	}

}
