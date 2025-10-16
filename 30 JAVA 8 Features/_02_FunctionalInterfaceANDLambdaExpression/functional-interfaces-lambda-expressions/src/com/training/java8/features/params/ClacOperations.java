package com.training.java8.features.params;

@FunctionalInterface // we can extend only those interface which has no abstract method but it has present default method and static method 
public interface ClacOperations extends ClaculateInterfaceWithoutAbstractMethod{

	double opertaion(int a,int b);
	default void printInfo() {
		System.out.println("This is default data.. of method");
	}
	static void typeOfOpertions() {
		System.out.println("static cpntent : Arithmetic Operaions");
	}
}
