package com.training.method.references;

public class MethodRefrencesDemo {

	public static void main(String[] args) {
        ConverToUpperCase toUpperCase=(value)->{
        	System.out.println("Inside lambada notation converting into uppercase");
           	return value.toUpperCase();
        };
        System.out.println(toUpperCase.convertToUppercase("java method refrenxce "));
        
        // method references
        // re -using/executing a pre defined method from String class
        // assigning that method reference of class
        ConverToUpperCase uppercaseTwo=String::toUpperCase;
        System.out.println(uppercaseTwo.convertToUppercase("java method refrences"));
	}

}
