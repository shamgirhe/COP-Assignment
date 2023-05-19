import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ::");
		int num = sc.nextInt();
		int num1;
		
		while(num>0)
			{
			num1=num%10;
			num=num/10;
			
			System.out.print( num1 );
	}
	}
}
