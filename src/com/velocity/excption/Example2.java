package com.velocity.excption;

public class Example2 {
	public static void main(String[] args) {
		int a=12;
		int b=6;
		try {
			System.out.println("statemnet 1");
			System.out.println("Statement 2");
		}catch(ArithmeticException e) {
			System.out.println("Statement 3");
		}
		System.out.println("Statement 4");
	}

}
