/*2.7 Add all of above classes under the package "com.app.fruits"

2.8 Create java application FruitBasket ,
 with main method , as a tester
2.9 Prompt user for the basket size n 
create suitable data structure

2.10 Supply options
1. Add Mango
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.

---------------------------------

4. Display names of all fruits in the basket.

5. Display name,color,weight , taste of all fresh fruits , in the basket.


6. Mark a fruit in a basket , as stale(=not fresh)
i/p : index 
o/p : error message 
(in case of invalid index) or mark it stale

7. Mark all sour fruits stale 
Hint : Use equals() method of the String class.

8. Invoke fruit specific functionality (pulp / juice / jam)
i/p : index
Invoke correct functionality (pulp / juice / jam)

*/
package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array:");
		int size = sc.nextInt();
		Fruit[] f = new Fruit[size];
		System.out.println("1.add Mango");
		System.out.println("2.add Orange");
		System.out.println("2.add Apple");
		System.out.println("4.Display all entries");
		System.out.println("5.Display names of all fruits");
		System.out.println("6.Display fruit as stale");
		System.out.println("7.Display names of all stale fruits");
		System.out.println("8.functioninality");

		int choice;
		Mango m =null;
		Apple a =null;
		Orange o=null;
		int i = 0;
		int e=0;
	
		do {
			System.out.println("Enter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter color, weight, name, fresh(true or False)");
				m= new Mango(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
				f[i] = m;
				i++;
				break;
			case 2:
				System.out.println("enter color, weight, name, fresh(true or False)");
				o = new Orange(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
				f[i] = o;
				i++;
				break;
			case 3:
				System.out.println("enter color, weight, name, fresh(true or False)");
				a = new Apple(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
				f[i] = a;
				i++;
				break;
			case 4:
				for (int k = 0; k < i; k++) {
					System.out.println(f[k]);
				}
				break;
			case 5:
				if (f[0] != null) {
					for (int k = 0; k < i; k++)
						System.out.println(f[k].getName());
				} else {
					System.out.println("array is empty");
				}
				break;
			case 6:
				System.out.println("enter index number");
				e=sc.nextInt();
				if (f[e] != null) {
				f[e].setFresh(false);
				}
				else 
				{
					System.out.println("index is not in the array");
				}
				break;
			case 7:
				System.out.println("Names of stale fruits:");
				for(int k=0;k<i;k++)
				{
				if (f[0] != null) {
					if(f[k].getfreshness()==false)
					{
							System.out.println(f[k].getName());
					}
				} 				
				else 
				{
					System.out.println("array is empty");
				}
				}
				break;
			case 8:
				System.out.println("enter index number");
				e=sc.nextInt();
				for(int k=0;k<i;k++)
				{
					if(k==e)
					{
						if(f[e].taste()=="sweet")
						{
							m.pulp();
						}
						else if(f[e].taste()=="sour")
						{
							o.juice();
						}
						else if(f[e].taste()=="sweet n sour")
						{
							a.jam();
						}
						else
						{
							System.out.println("invalid name");
						}
						
					}
				}
				
				break;
			case 9:
				System.out.println("exited succesfully");
				break;
			default:
				System.out.println("Invalid choice!!\n enter valid choice nd try again");
				break;
			}
		} while (choice != 9);
		sc.close();
	}

}
