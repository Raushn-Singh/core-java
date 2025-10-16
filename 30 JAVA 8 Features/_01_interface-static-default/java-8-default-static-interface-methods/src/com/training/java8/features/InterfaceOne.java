package com.training.java8.features;

public interface InterfaceOne {
    // public abstract
	//Abstract methods/Non-Implemented Methods
	void printNames();
	String getNames();
	
	//Trying to Define Implementation Methods
	default void deafultMethodOne() {
		//logic
		System.out.println("Inside Default Method One..");
	}
	default String deafultMethodTwo() {
		//logic
		System.out.println("Inside Default Method One..");
		return "deafultMethodTwo";
	}
	default void defaultMethodFive() {
		System.out.println("Insdie Interface One DefaultMethodFive");
	}
	// static methods
	static String staticMethodOne() {
		System.out.println("This is static methodOne");
		return "This is static method";
	}
	static void staticMethodTwo() {
		System.out.println("This is static Method Two");
	}
}
