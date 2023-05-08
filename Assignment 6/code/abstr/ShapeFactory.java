package com.code.abstr;

import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class ShapeFactory extends Shape {
//	private static double y;
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	Circle c = null;
	int y;
	Square s = null;
	Rectangle r = null;

	public double area() {
		y = random.nextInt(3);
		return y;
	}

	public void generateShape(int random) {
		if (y == 1) {
			System.out.println("randomnly geneated shape is circle so");
			System.out.println("enter radius");
			c = new Circle(sc.nextDouble());
			double ae = c.area();
			System.out.println("area of circle" + ae);

		} else if (y == 2) {
			System.out.println("randomnly geneated shape is rectangle so");
			System.out.println("enter length and breadth");
			r = new Rectangle(sc.nextDouble(), sc.nextDouble());
			double ae = r.area();
			System.out.println("area of rectangle:" + ae);
		} else {
			System.out.println("randomnly geneated shape is square so");
			System.out.println("enter side");
			s = new Square(sc.nextDouble());
			double ae = s.area();
			System.out.println("area of square" + ae);
		}

	}

	{

	}

}
