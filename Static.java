package com.statict;

public class Static {
	private static int var1 = 5;
	private static int var2 = 10;

	public static int add() {
		return var1 + var2;
	}

	public int substract() {
		return var2 - var1;
	}
}
