package com.shape;

public class ShapeDemo1 {
	public static void main(String args[]) {
		Shape shape[] = new Shape[2];
		shape[0] = new Rectangle();
		shape[1] = new Circle();
		for (int i = 0; i < 2; i++) {
			shape[i].draw();
		}
	}
}
