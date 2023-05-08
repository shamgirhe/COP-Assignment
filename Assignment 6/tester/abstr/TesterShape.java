package com.tester.abstr;

import java.util.Scanner;
import com.code.abstr.*;

public class TesterShape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape s = null;
		System.out.println("1.to calculate area of circle");
		System.out.println("2.to calculate area of rectangle");
		System.out.println("3.to calculate area of square");
		System.out.println("4.to clculate area of randomlely generated shape");
		System.out.println("5.to exit");
		int choice = 0;
		Circle c = null;
		Square g = null;
		Rectangle r = null;
		ShapeFactory sf = new ShapeFactory();

		do {
			System.out.println("enter choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter radius:");
				c = new Circle(sc.nextDouble());
				System.out.println(c.area());
				c.area();
				break;
			case 2:
				System.out.println("enter length and breadth");
				r = new Rectangle(sc.nextDouble(), sc.nextDouble());
				double ae = r.area();
				System.out.println("area of rectangle:" + ae);
				break;
			case 3:
				System.out.println("enter side");
				g = new Square(sc.nextDouble());
				double e = g.area();
				System.out.println("area of square" + e);
				break;
			case 4:
				double q = sf.area();
				int y = (int) q;
				sf.generateShape(y);
				break;
			case 5:
				System.out.println("Exited Succesfully!");
				break;
			}

		} while (choice != 5);
		sc.close();
	}
}