package com.training.java8.features.params;

public interface ClaculateInterfaceWithoutAbstractMethod {

	default void printInfo() {
		System.out.println("This is default data.. of method");
	}
	static void typeOfOpertions() {
		System.out.println("static cpntent : Arithmetic Operaions");
	}
}
