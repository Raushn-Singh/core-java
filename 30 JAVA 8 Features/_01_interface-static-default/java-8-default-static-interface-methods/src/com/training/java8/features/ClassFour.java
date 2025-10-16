package com.training.java8.features;

public class ClassFour implements InterfaceOne{

	@Override
	public void printNames() {
		System.out.println("This is ClassThree:PrintNames");
	}

	@Override
	public String getNames() {
		InterfaceOne.staticMethodOne();
		System.out.println("This is ClassThree: getNames");
		return "This is ClassThree : getNames";
	}

}
