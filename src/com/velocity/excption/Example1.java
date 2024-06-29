package com.velocity.excption;

public class Example1 {
	public static void main(String[] args) {
		int a=12;
				int b=0;
				try {
					System.out.println("statement 1");
					System.out.println(a/b);
					
					System.out.println("statement 2");
				}catch(ArithmeticException e) {
					System.out.println("Statement 4");
				}
				System.out.println("Statement 5");
				
				
				
				
				
	}

}
