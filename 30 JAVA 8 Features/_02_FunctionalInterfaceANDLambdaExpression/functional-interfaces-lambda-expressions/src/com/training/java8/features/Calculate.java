package com.training.java8.features;

@FunctionalInterface
public interface Calculate {
	//1: Only one abstract method
    void printName();
    
    //N:default methods
    default void methodDefaultOne() {
    	System.out.println("this is default method");
    }
    default void methodDefaultTwo() {
    	System.out.println("this is default method");
    }
    static void methodStaticOne() {
    	System.out.println("This is satic method");
    }
}
