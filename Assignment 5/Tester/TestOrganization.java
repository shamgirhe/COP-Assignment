package Tester;
import com.app.org.Emp;
import java.util.Scanner;

import com.app.org.*;

public class TestOrganization {

	public static void main(String[] args) {
		Emp[] e = new Emp[4];
		Scanner sc = new Scanner(System.in);
		Mgr m=null;
		Worker w=null;

		System.out.println("1.manager:");
		System.out.println("2.worker:");
		System.out.println("3.exit");

		int index;
		int choice = 0;
		int counter=0;
		int i;

		do {
			System.out.println("enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter first_name last_name EmpId basic_salary performance bonus ");
				 m=new Mgr(sc.next(), sc.next() ,sc.nextInt(),sc.nextInt(),sc.nextInt());
				 e[counter]=m;
				 counter++;
				break;
			case 2: System.out.println(" firstName,  lastname, deptId, basic, hoursWorked, hourlyRate");
				w=new Worker(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
				e[counter]=w;
				counter++;
				break;
			case 3:
				break;
			case 4:System.out.println("exited succesfully");
				break;
			default:
				break;
			}

		} while (choice != 4);

	}

}
