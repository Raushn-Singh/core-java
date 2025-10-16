package com.training.java8.features.params;

public class FunctionalInterfaceWithParamsDemo {

	public static void main(String[] args) {
		//1St lambda Expression
		ClacOperations addition=(int x,int y)->{
			System.out.println("Values are :"+x+","+y);
			return x+y;
		};
		
		double opertaion = addition.opertaion(30, 40);
		System.out.println(opertaion);
		// 2nd lambda Expression
		ClacOperations substractions=(p,q)->{
			return p-q;
		};
		System.out.println(substractions.opertaion(100, 50));
	    // 3rd lambda Expression
		 ClacOperations multiplication=(p,q)->{
			return p*q; 
		 };
		 System.out.println(multiplication.opertaion(20, 20));
		 // execute default method
		 multiplication.printInfo();
		 // static method of FI
		 ClacOperations.typeOfOpertions();
	}

}
