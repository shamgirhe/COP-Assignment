import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:: ");
		int num = sc.nextInt();
		int a=0;

		for( int i=0; i<=num; i++)
		{
		int count=i+1;
		for(int j=i; j<num+1; j++ ) {
		System.out.print("  ");
		}
		for(int j=0; j<=i; j++)
		{
		System.out.print(""+/*(char)*/(count/*+64*/)+" ");
		a=count++;
		}

		for(int j=0; j<i; j++)
		{
		a--;
		 System.out.print(/*(char)*/(a/*+64*/)+" ");
		 
		}
		System.out.println();
		}
		for( int i=num-1; i>=0; i--)
		{
		int count=i+1;
		for(int j=num+1; j>i; j-- ) {
		System.out.print("  ");
		}
		for(int j=i; j>=0; j--)
		{
		System.out.print(""+/*(char)*/(count/*+64*/)+" ");
		a=count++;
		}

		for(int j=i; j>0; j--)
		{
		a--;
		 System.out.print(/*(char)*/(a/*+64*/)+" ");
		 
		}
		System.out.println();
		}

		}


	}


