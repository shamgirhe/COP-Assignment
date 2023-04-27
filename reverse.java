import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enetr number to reverse it digit :");
		int n=sc.nextInt();
		
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			System.out.print(r);
		}

	}

}
