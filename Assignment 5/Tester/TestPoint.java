package Tester;

import java.util.Scanner;

import com.cdac.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		int choice;
		int counter = 0;
		System.out.println("enter size");
		size = sc.nextInt();
		Point2D r = null;
		int z=0;
		int x=0;
		Point2D[] p = new Point2D[size];
		System.out.println("1.add point");
		System.out.println("2.Display point");
		System.out.println("3.are points same?");
		System.out.println("4.calculate distance");
		System.out.println("5.exit");

		do {
			System.out.println("enter choice:");
			choice = sc.nextInt();
			boolean f = false;
			switch (choice) {
			case 1:
				System.out.println("enter the co-ordinates X and Y:");
				r = new Point2D(sc.nextInt(), sc.nextInt());
				p[counter] = r;
				counter++;
				System.out.println("point added succesfully");

				break;
				
			case 2:
				for (int i = 0; i < counter; i++) {
					System.out.println(p[i].show());
				}
				break;

			case 3:
				System.out.println("enter 1st index");
				 z=sc.nextInt();
				System.out.println("enter 2nd index");
				 x=sc.nextInt();
				
				f = r.isEqual(p[z], p[x]);
//				if(f==true)
//				System.out.println("the points are same");
				break;
			case 4:

				if (f == false) {
					r.calDistance(p[z], p[x]);
					break;
				} else
					System.out.println("co-ordinates of both points are same");
				break;
			case 5:
				System.out.println("exited succesfully");
				break;
			}

		} while (choice != 5);
		sc.close();
	}

}
