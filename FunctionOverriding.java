//Overloading Function
package com.vehicle;

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}
}

public class FunctionOverriding {
	public static void main(String args[]) {
		Bike bike = new Bike();
		bike.run();
	}
}
