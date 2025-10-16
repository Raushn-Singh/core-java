package com.training.java8.features;

public class ClassThree implements InterfaceOne,InterfaceTwo {

	@Override
	public void printNames() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void defaultMethodFive() {
		// TODO Auto-generated method stub
		InterfaceOne.super.defaultMethodFive();
		InterfaceTwo.super.defaultMethodFive();
	}

}
