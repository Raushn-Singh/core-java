package com.training.java8.features;

public class ClassTwo implements InterfaceOne {

	@Override
	public void printNames() {
       System.out.println("in classTwo : printNames");		
	}

	@Override
	public String getNames() {
		System.out.println("Getiing names two class");
		return null;
	}

}
