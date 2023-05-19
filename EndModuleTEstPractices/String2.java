import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String str = sc.nextLine();
		int count = 0;
		
		
		char[] arr = new char[str.length()];
		arr = str.toCharArray();
		
		for(int i=0 ; i<arr.length;i++)
		{
			if(arr[i]== 'a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
			{
				count++;
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println(count);

	}

}
