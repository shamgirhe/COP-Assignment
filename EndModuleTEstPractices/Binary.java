import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary number::");
		 int binary = sc.nextInt();
		 int bin = binary;
		 int dec ;
		 int sum=0;
		 int count = 0;
		 int pow = 1;
		 while(bin> 0)
		 {
			 dec = bin%10;//0
			 bin= bin/10;//10
			 for(int i =0; i<count/*1*/ ; i++)
			 {
				 pow = pow * 2 ;
				 break;
			 }
			 count++;//1
			 sum = sum + dec * pow ;//2
		 }
		 System.out.println("Decimal of "+binary+" number is:: "+sum);
	}

}
