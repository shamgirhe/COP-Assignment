package com.code.abstr;

public class Rectangle extends Shape {
	private double l;
	private double b;

	public Rectangle() {

	}

	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	public double area() {
		return l * b;
	}

}
