/* 1:Create Date class with members day,month ,year.
Write no argument and parameterised constructor .Create two object s and initialize them using no argument and parameterised constructor
respectively.Print date using display function.*/
package code;

public class Date {
	
	int day,month,year;
	public Date()
	{
		System.out.println("---------constructor invoked---------");
		day=5;
		month=8;
		year=1999;
	}
	public Date(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
	
	public void Display()
	{
		System.out.println("your entered date: "+day+"/"+month+"/"+year);
	}
}