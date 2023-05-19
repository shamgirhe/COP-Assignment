import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range of Lower and upper number::");
	int low = sc.nextInt();
	int upper = sc.nextInt();
	
	for(int i = low; i<=upper; i++)
	{	int count = 1;
		 
	  for(int j=2; j<=i; j++)
	  {   	if(i%j==0)
	     		count++;
	  }
	 if(count==2)
		 System.out.print(i+ " ");
	}
	}
}
