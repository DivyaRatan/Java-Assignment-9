package com.sum;

public class Overloading {
	public static void main(String args[]) {
		SumOf Add = new SumOf();
		System.out.println("Addition of three numbers is " + Add.sum(10, 2, 5));
		System.out.println("Addition of two numbers is " + Add.sum(10, 5));
	}
}
