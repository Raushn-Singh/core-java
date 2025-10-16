package com.training.java8.features;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface can refer impl .class instance
		Calculate calc=new Camel();
		calc.printName();
		// lambda Expression Implementation
		Calculate abc=()->{
			//logic
			System.out.println("This is Abc company calc ");
		}  ;    
		Calculate xyz=()->{
			//logic
			System.out.println("This is XYZ company calc ");
		}  ;    
        abc.printName();
        xyz.printName();
	}

}
