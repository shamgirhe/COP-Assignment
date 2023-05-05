 package tester;

import java.util.Scanner;
import code.Bank;

public class TesterBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b1;
		Bank[] b = new Bank[10];
		
		int counter = 0;
		int choice ;
		//int i = 0;
		int e1;
		int e2;
		System.out.println("1.create acc");
		System.out.println("2.display");
		System.out.println("3.transfer money");
		do {

			System.out.println("enter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (counter < b.length)
				{
					System.out.println("Enter  ID Name email balance");
					b1 = new Bank(sc.nextInt(), sc.next(), sc.next(),sc.nextInt());
					b[counter] = b1;
					counter++;
					
					System.out.println("Account created succesfully");
				} 
				else
				{
					System.out.println("Array is full");
				}
				break;


			case 2:
				for (int o = 0; o < counter; o++)
				{
					b[o].Display();
				}
				break;

			case 3:
				System.out.println("Enter sender's EmpID:");
				e1 = sc.nextInt();
				System.out.println("Enter reciever's EmpID:");
				e2 = sc.nextInt();

				for (int o = 0; o < counter; o++) {
					if (e1 == b[o].getEmpId()) {
						for (int j = 0; j < counter; j++) {
							if (e2 == b[j].getEmpId()) {
								System.out.println("enter amount to transfer");
								b[o].transferMoney(b[j], sc.nextInt());
							}
						}
					} 
				}
				break;
			}
			
		} while (choice!=5);

		sc.close();
	}

}
