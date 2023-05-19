import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number::");
		int num = sc.nextInt();
	  
	for(int j=0; j<num; j++) 
	{
	  int num1 = 1;
	 for(int i=j; i<num-1; i++) 
    	 {
		 	System.out.print(" ");
    	}
	 for(int i=0; i<=j ; i++)//1
	 {
		 System.out.print(+num1+" ");
		num1 = num1*(j-i)/(i+1);//1*2-1/2   
	 }
	 System.out.println();
	}
	for(int j=0; j<num; j++) 
	{
	  char num1 = 'A';
	 for(int i=0; i<j; i++) 
    	 {
		 	System.out.print(" ");
    	}
	 for(int i=num; i>j ; i--)
	 {
		 System.out.print(num1+" ");
		num1++; 
	 }
	 System.out.println();
	}
	for(int j=1; j<num; j++) 
	{
	  int num1 = 1;
	 for(int i=j; i<num-1; i++) 
    	 {
		 	System.out.print(" ");
    	}
	 for(int i=0; i<=j ; i++)//1
	 {
		 System.out.print((char)(num1+64)+" ");
		num1 = num1*(j-i)/(i+1);//1*2-1/2   
	 }
	 System.out.println();
	}
}

}
