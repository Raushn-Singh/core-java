package com.training.java8.features;

public interface InterfaceTwo {

	default void defaultMethoThree() {
		System.out.println("Inside InterfaceTwo :defaltMethodThree....");
	}
	default void defaultMethodFive() {
		System.out.println("Insdie Interface Two DefaultMethodFive");
	}
}
