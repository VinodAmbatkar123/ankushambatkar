package com.velocity.excption;

public class Example3 {
	public static void main(String[] args) {
		int a=12;
		int b=0;
		try {
			System.out.println("this is statement 1");
			System.out.println(a/b);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("printing from 1"+e);
		}
		//catch(ArithmeticException e) {
		//	System.out.println("printing from 2"+e);
		//}
		catch(RuntimeException e) {
			System.out.println("printing from 3"+e);
		}
	}

}
